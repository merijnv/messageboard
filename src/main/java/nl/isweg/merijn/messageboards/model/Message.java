package nl.isweg.merijn.messageboards.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

/**
 * Data object containing message
 */
@Data
@Builder
public class Message {
    /**
     * Identifies the board, for instance 'jenkins' or 'home'
     */
    @JsonIgnore
    String board;

    /**
     * The first line of text on the display.
     * Note that the target display is only 16 characters wide.
     */
    String line1;

     /**
     * The second line of text on the display.
     * Note that the target display is only 16 characters wide.
     */
    String line2;

    /**
     * The color associated with the message,
     * the leds of the messageboard get this color.
     */
    Color color;
}
