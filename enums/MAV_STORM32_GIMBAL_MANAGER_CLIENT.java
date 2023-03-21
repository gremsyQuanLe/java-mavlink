/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/**
 * Gimbal manager client ID. In a prioritizing profile, the priorities are determined by the implementation; they could e.g. be custom1 > onboard > GCS > autopilot/camera > GCS2 > custom2.
 */
public class MAV_STORM32_GIMBAL_MANAGER_CLIENT {
   public static final int MAV_STORM32_GIMBAL_MANAGER_CLIENT_NONE = 0; /* For convenience. | */
   public static final int MAV_STORM32_GIMBAL_MANAGER_CLIENT_ONBOARD = 1; /* This is the onboard/companion computer client. | */
   public static final int MAV_STORM32_GIMBAL_MANAGER_CLIENT_AUTOPILOT = 2; /* This is the autopilot client. | */
   public static final int MAV_STORM32_GIMBAL_MANAGER_CLIENT_GCS = 3; /* This is the GCS client. | */
   public static final int MAV_STORM32_GIMBAL_MANAGER_CLIENT_CAMERA = 4; /* This is the camera client. | */
   public static final int MAV_STORM32_GIMBAL_MANAGER_CLIENT_GCS2 = 5; /* This is the GCS2 client. | */
   public static final int MAV_STORM32_GIMBAL_MANAGER_CLIENT_CAMERA2 = 6; /* This is the camera2 client. | */
   public static final int MAV_STORM32_GIMBAL_MANAGER_CLIENT_CUSTOM = 7; /* This is the custom client. | */
   public static final int MAV_STORM32_GIMBAL_MANAGER_CLIENT_CUSTOM2 = 8; /* This is the custom2 client. | */
   public static final int MAV_STORM32_GIMBAL_MANAGER_CLIENT_ENUM_END = 9; /*  | */
}
            