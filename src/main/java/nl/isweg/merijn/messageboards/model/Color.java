package nl.isweg.merijn.messageboards.model;

import lombok.*;

/**
 * Data object containing color
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Color {
    private int r;
    private int g;
    private int b;
}
