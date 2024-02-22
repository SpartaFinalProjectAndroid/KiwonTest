package com.example.kiwontest

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.kiwontest.databinding.ActivityMainBinding
import com.naver.maps.map.LocationSource
import com.naver.maps.map.NaverMap
import com.naver.maps.map.util.FusedLocationSource

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var locationSource: FusedLocationSource
//    private lateinit var naverMap: NaverMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        onMapReady(naverMap)
    }

    fun onMapReady(naverMap: NaverMap) {
        Log.d(TAG, "MainActivity - onMapReady")
        naverMap.locationSource = locationSource
        naverMap.uiSettings.isLocationButtonEnabled = true

        naverMap.addOnLocationChangeListener { location ->
            Toast.makeText(this, "${location.latitude}, ${location.longitude}", Toast.LENGTH_SHORT)
                .show()

            Log.d(TAG, "${location.latitude}, ${location.longitude}")
        }
    }

}