package com.windhoverlabs.yamcs.gps;

import java.util.List;

/** Listener of gps events from GPS receiver */
public interface GpsDataListener {
  void updateSatelliteInfo(List<Satellite> satellites);

  void updatePosition(Position position);
}
