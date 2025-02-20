package com.vsb.Austra.dto;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1

public class WeatherApiDto{
    private Location location;
    private Current current;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}


