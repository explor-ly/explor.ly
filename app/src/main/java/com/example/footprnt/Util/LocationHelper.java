package com.example.footprnt.Util;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;
import java.util.Locale;

public class LocationHelper {
    public String getAddress(Context context, LatLng point){
        try {
            Geocoder geo = new Geocoder(context, Locale.getDefault());
            List<Address> addresses = geo.getFromLocation(point.latitude, point.longitude, 1);
            if (addresses.isEmpty()) {
                return "Waiting for location...";
            }
            else {
                if (addresses.size() > 0) {
                    return (addresses.get(0).getFeatureName() + ", " + addresses.get(0).getLocality() +", " + addresses.get(0).getAdminArea() + ", " + addresses.get(0).getCountryName());
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace(); // getFromLocation() may sometimes fail
            return null;
        }
        return null;
    }


    public void centreMapOnLocation(GoogleMap map, Location location, String title){
        LatLng userLocation = new LatLng(location.getLatitude(),location.getLongitude());
        map.addMarker(new MarkerOptions().position(userLocation).title(title));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(userLocation,12));
    }

}