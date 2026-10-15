import java.awt.*;
import java.awt.image.BufferedImage;

public class PhotoEditor {
    public BufferedImage resize(BufferedImage image) {
        double scale = Math.min(1.0,
                200.0 / Math.max(image.getWidth(), image.getHeight()));
        int width = Math.max(1, (int) (image.getWidth() * scale));
        int height = Math.max(1, (int) (image.getHeight() * scale));

        BufferedImage result = new BufferedImage(width, height, 2);
        Graphics2D g = result.createGraphics();
        g.drawImage(image, 0, 0, width, height, null);
        g.dispose();
        return result;
    }
}