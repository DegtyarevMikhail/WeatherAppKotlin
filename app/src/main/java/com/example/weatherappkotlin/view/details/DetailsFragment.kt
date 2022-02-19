package com.example.weatherappkotlin.view.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weatherappkotlin.R
import com.example.weatherappkotlin.databinding.FragmentDetailsBinding
import com.example.weatherappkotlin.model.WeatherInfo

class DetailsFragment : Fragment() {

    private var _binding:FragmentDetailsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (requireArguments().containsKey(BUNDLE_EXTRA)) {
            val weatherInfo = arguments?.getParcelable<WeatherInfo>(BUNDLE_EXTRA)
            if (weatherInfo != null) {

                binding.cityName.text = weatherInfo.cityInfo.city
                binding.cityCoordinates.text = String.format(
                    getString(R.string.city_coordinates),
                    weatherInfo.cityInfo.lat.toString(),
                    weatherInfo.cityInfo.lon.toString()
                )
                val degreeOfCelsius:String = getString(R.string.degree_of_celsius)
                binding.temperatureValue.text = weatherInfo.temperature.toString() + degreeOfCelsius
                binding.feelsLikeValue.text = weatherInfo.feelsLike.toString() + degreeOfCelsius
            }
        }

    }

    companion object{
        const val BUNDLE_EXTRA = "weather"

        fun newInstance(bundle: Bundle): DetailsFragment {
            val fragment = DetailsFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

}
