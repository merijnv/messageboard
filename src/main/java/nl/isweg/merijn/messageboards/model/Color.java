package nl.isweg.merijn.messageboards.model;

import lombok.Builder;
import lombok.Data;

/**
 * Data object containing color
 */
@Data
@Builder
public class Color {
    int r;
    int g;
    int b;
}
