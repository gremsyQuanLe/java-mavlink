/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/**
 * Standard modes with a well understood meaning across flight stacks and vehicle types.
        For example, most flight stack have the concept of a "return" or "RTL" mode that takes a vehicle to safety, even though the precise mechanics of this mode may differ.
        Modes may be set using MAV_CMD_DO_SET_STANDARD_MODE.
      
 */
public class MAV_STANDARD_MODE {
   public static final int MAV_STANDARD_MODE_NON_STANDARD = 0; /* Non standard mode.
          This may be used when reporting the mode if the current flight mode is not a standard mode.
         | */
   public static final int MAV_STANDARD_MODE_POSITION_HOLD = 1; /* Position mode (manual).
          Position-controlled and stabilized manual mode.
          When sticks are released vehicles return to their level-flight orientation and hold both position and altitude against wind and external forces.
          This mode can only be set by vehicles that can hold a fixed position.
          Multicopter (MC) vehicles actively brake and hold both position and altitude against wind and external forces.
          Hybrid MC/FW ("VTOL") vehicles first transition to multicopter mode (if needed) but otherwise behave in the same way as MC vehicles.
          Fixed-wing (FW) vehicles must not support this mode.
          Other vehicle types must not support this mode (this may be revisited through the PR process).
         | */
   public static final int MAV_STANDARD_MODE_ORBIT = 2; /* Orbit (manual).
          Position-controlled and stabilized manual mode.
          The vehicle circles around a fixed setpoint in the horizontal plane at a particular radius, altitude, and direction.
          Flight stacks may further allow manual control over the setpoint position, radius, direction, speed, and/or altitude of the circle, but this is not mandated.
          Flight stacks may support the [MAV_CMD_DO_ORBIT](https://mavlink.io/en/messages/common.html#MAV_CMD_DO_ORBIT) for changing the orbit parameters.
          MC and FW vehicles may support this mode.
          Hybrid MC/FW ("VTOL") vehicles may support this mode in MC/FW or both modes; if the mode is not supported by the current configuration the vehicle should transition to the supported configuration.
          Other vehicle types must not support this mode (this may be revisited through the PR process).
         | */
   public static final int MAV_STANDARD_MODE_CRUISE = 3; /* Cruise mode (manual).
          Position-controlled and stabilized manual mode.
          When sticks are released vehicles return to their level-flight orientation and hold their original track against wind and external forces.
          Fixed-wing (FW) vehicles level orientation and maintain current track and altitude against wind and external forces.
          Hybrid MC/FW ("VTOL") vehicles first transition to FW mode (if needed) but otherwise behave in the same way as MC vehicles.
          Multicopter (MC) vehicles must not support this mode.
          Other vehicle types must not support this mode (this may be revisited through the PR process).
         | */
   public static final int MAV_STANDARD_MODE_ALTITUDE_HOLD = 4; /* Altitude hold (manual).
          Altitude-controlled and stabilized manual mode.
          When sticks are released vehicles return to their level-flight orientation and hold their altitude.
          MC vehicles continue with existing momentum and may move with wind (or other external forces).
          FW vehicles continue with current heading, but may be moved off-track by wind.
          Hybrid MC/FW ("VTOL") vehicles behave according to their current configuration/mode (FW or MC).
          Other vehicle types must not support this mode (this may be revisited through the PR process).
         | */
   public static final int MAV_STANDARD_MODE_RETURN_HOME = 5; /* Return home mode (auto).
          Automatic mode that returns vehicle to home via a safe flight path.
          It may also automatically land the vehicle (i.e. RTL).
          The precise flight path and landing behaviour depend on vehicle configuration and type.
         | */
   public static final int MAV_STANDARD_MODE_SAFE_RECOVERY = 6; /* Safe recovery mode (auto).
          Automatic mode that takes vehicle to a predefined safe location via a safe flight path (rally point or mission defined landing) .
          It may also automatically land the vehicle.
          The precise return location, flight path, and landing behaviour depend on vehicle configuration and type.
         | */
   public static final int MAV_STANDARD_MODE_MISSION = 7; /* Mission mode (automatic).
          Automatic mode that executes MAVLink missions.
          Missions are executed from the current waypoint as soon as the mode is enabled.
         | */
   public static final int MAV_STANDARD_MODE_LAND = 8; /* Land mode (auto).
          Automatic mode that lands the vehicle at the current location.
          The precise landing behaviour depends on vehicle configuration and type.
         | */
   public static final int MAV_STANDARD_MODE_TAKEOFF = 9; /* Takeoff mode (auto).
          Automatic takeoff mode.
          The precise takeoff behaviour depends on vehicle configuration and type.
         | */
   public static final int MAV_STANDARD_MODE_ENUM_END = 10; /*  | */
}
            