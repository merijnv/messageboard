package nl.isweg.merijn.messageboards.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

/**
 * Data object containing message
 */
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {
    /**
     * The first line of text on the display.
     * Note that the target display is only 16 characters wide.
     */
    private String line1;

     /**
     * The second line of text on the display.
     * Note that the target display is only 16 characters wide.
     */
    private String line2;

    /**
     * The color associated with the message,
     * the leds of the messageboard get this color.
     */
    private Color color;
}
