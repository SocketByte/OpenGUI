package pl.socketbyte.opengui;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum Rows {

    ONE(9),
    TWO(18),
    THREE(27),
    FOUR(36),
    FIVE(45),
    SIX(54);

    @Setter
    private int slots;

    Rows(int slots) {
        this.slots = slots;
    }
}
