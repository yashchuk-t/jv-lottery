package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int index = new Random().nextInt(Color.values().length);
        Color color = colors[index];
        return color.name();
    }
}
