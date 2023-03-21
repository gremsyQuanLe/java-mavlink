/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE PARAM_VALUE_ARRAY PACKING
package com.MAVLink.storm32;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Parameter multi param value container.
 */
public class msg_param_value_array extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_PARAM_VALUE_ARRAY = 60041;
    public static final int MAVLINK_MSG_LENGTH = 255;
    private static final long serialVersionUID = MAVLINK_MSG_ID_PARAM_VALUE_ARRAY;

    
    /**
     * Total number of onboard parameters.
     */
    @Description("Total number of onboard parameters.")
    @Units("")
    public int param_count;
    
    /**
     * Index of the first onboard parameter in this array.
     */
    @Description("Index of the first onboard parameter in this array.")
    @Units("")
    public int param_index_first;
    
    /**
     * Flags.
     */
    @Description("Flags.")
    @Units("")
    public int flags;
    
    /**
     * Number of onboard parameters in this array.
     */
    @Description("Number of onboard parameters in this array.")
    @Units("")
    public short param_array_len;
    
    /**
     * Parameters buffer. Contains a series of variable length parameter blocks, one per parameter, with format as specifed elsewhere.
     */
    @Description("Parameters buffer. Contains a series of variable length parameter blocks, one per parameter, with format as specifed elsewhere.")
    @Units("")
    public short packet_buf[] = new short[248];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_PARAM_VALUE_ARRAY;

        packet.payload.putUnsignedShort(param_count);
        packet.payload.putUnsignedShort(param_index_first);
        packet.payload.putUnsignedShort(flags);
        packet.payload.putUnsignedByte(param_array_len);
        
        for (int i = 0; i < packet_buf.length; i++) {
            packet.payload.putUnsignedByte(packet_buf[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a param_value_array message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.param_count = payload.getUnsignedShort();
        this.param_index_first = payload.getUnsignedShort();
        this.flags = payload.getUnsignedShort();
        this.param_array_len = payload.getUnsignedByte();
        
        for (int i = 0; i < this.packet_buf.length; i++) {
            this.packet_buf[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_param_value_array() {
        this.msgid = MAVLINK_MSG_ID_PARAM_VALUE_ARRAY;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_param_value_array( int param_count, int param_index_first, int flags, short param_array_len, short[] packet_buf) {
        this.msgid = MAVLINK_MSG_ID_PARAM_VALUE_ARRAY;

        this.param_count = param_count;
        this.param_index_first = param_index_first;
        this.flags = flags;
        this.param_array_len = param_array_len;
        this.packet_buf = packet_buf;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_param_value_array( int param_count, int param_index_first, int flags, short param_array_len, short[] packet_buf, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_PARAM_VALUE_ARRAY;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.param_count = param_count;
        this.param_index_first = param_index_first;
        this.flags = flags;
        this.param_array_len = param_array_len;
        this.packet_buf = packet_buf;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_param_value_array(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_PARAM_VALUE_ARRAY;

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
        return "MAVLINK_MSG_ID_PARAM_VALUE_ARRAY - sysid:"+sysid+" compid:"+compid+" param_count:"+param_count+" param_index_first:"+param_index_first+" flags:"+flags+" param_array_len:"+param_array_len+" packet_buf:"+packet_buf+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_PARAM_VALUE_ARRAY";
    }
}
        