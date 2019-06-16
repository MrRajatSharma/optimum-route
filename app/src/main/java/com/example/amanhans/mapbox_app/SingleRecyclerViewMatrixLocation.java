package com.example.amanhans.mapbox_app;

import com.mapbox.mapboxsdk.geometry.LatLng;

/**
 * POJO model class for a single location in the recyclerview
 */
public class SingleRecyclerViewMatrixLocation {

    private String name;
    private LatLng locationLatLng;
    private String distanceFromOrigin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistanceFromOrigin() {
        return distanceFromOrigin;
    }

    public void setDistanceFromOrigin(String distanceFromOrigin) {
        this.distanceFromOrigin = distanceFromOrigin;
    }

    public void setLocationLatLng(LatLng locationLatLng) {
        this.locationLatLng = locationLatLng;
    }

    @Override
    public String toString() {
        return "SingleRecyclerViewMatrixLocation{" +
                "name='" + name + '\'' +
                ", locationLatLng=" + locationLatLng +
                ", distanceFromOrigin='" + distanceFromOrigin + '\'' +
                '}';
    }
}