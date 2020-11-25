package ru.pavlenty.simplegooglemap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity  implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        LatLng Moscow = new LatLng(55.6008447, 37.0262533);
        LatLng SaintPetersburg = new LatLng(59.9370369, 28.973827);
        LatLng Sydney = new LatLng(-34, 151);
        LatLng NewYork = new LatLng(40.6976701, -74.2598609);
        LatLng Cairo = new LatLng(30.0596185, 31.1884245);
        map.addMarker(new MarkerOptions().position(Moscow).title("Moscow"));
        map.addMarker(new MarkerOptions().position(Sydney).title("Sydney"));
        map.addMarker(new MarkerOptions().position(SaintPetersburg).title("Saint Petersburg"));
        map.addMarker(new MarkerOptions().position(NewYork).title("New York"));
        map.addMarker(new MarkerOptions().position(Cairo).title("Cairo"));
    }
}
