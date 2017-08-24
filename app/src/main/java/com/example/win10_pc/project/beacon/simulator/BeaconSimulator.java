package com.example.win10_pc.project.beacon.simulator;

import org.altbeacon.beacon.Beacon;

import java.util.List;

/**
 * Created by dyoung on 4/18/14.
 */
public interface BeaconSimulator {
    public List<Beacon> getBeacons();
}
