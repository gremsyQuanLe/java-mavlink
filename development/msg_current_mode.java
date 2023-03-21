/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CURRENT_MODE PACKING
package com.MAVLink.development;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Get the current mode.
        This should be emitted on any mode change, and broadcast at low rate (nominally 0.5 Hz).
        It may be requested using MAV_CMD_REQUEST_MESSAGE.
      
 */
public class msg_current_mode extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_CURRENT_MODE = 436;
    public static final int MAVLINK_MSG_LENGTH = 6;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CURRENT_MODE;

    
    /**
     * A bitfield for use for autopilot-specific flags
     */
    @Description("A bitfield for use for autopilot-specific flags")
    @Units("")
    public long custom_mode;
    
    /**
     * Standard mode.
     */
    @Description("Standard mode.")
    @Units("")
    public short standard_mode;
    
    /**
     * System mode bitmap.
     */
    @Description("System mode bitmap.")
    @Units("")
    public short base_mode;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_CURRENT_MODE;

        packet.payload.putUnsignedInt(custom_mode);
        packet.payload.putUnsignedByte(standard_mode);
        packet.payload.putUnsignedByte(base_mode);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a current_mode message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.custom_mode = payload.getUnsignedInt();
        this.standard_mode = payload.getUnsignedByte();
        this.base_mode = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_current_mode() {
        this.msgid = MAVLINK_MSG_ID_CURRENT_MODE;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_current_mode( long custom_mode, short standard_mode, short base_mode) {
        this.msgid = MAVLINK_MSG_ID_CURRENT_MODE;

        this.custom_mode = custom_mode;
        this.standard_mode = standard_mode;
        this.base_mode = base_mode;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_current_mode( long custom_mode, short standard_mode, short base_mode, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_CURRENT_MODE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.custom_mode = custom_mode;
        this.standard_mode = standard_mode;
        this.base_mode = base_mode;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_current_mode(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_CURRENT_MODE;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_CURRENT_MODE - sysid:"+sysid+" compid:"+compid+" custom_mode:"+custom_mode+" standard_mode:"+standard_mode+" base_mode:"+base_mode+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_CURRENT_MODE";
    }
}
        