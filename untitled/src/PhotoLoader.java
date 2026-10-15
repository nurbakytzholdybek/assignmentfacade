import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class PhotoLoader {
    public BufferedImage load(String path) throws IOException {
        BufferedImage image = ImageIO.read(new File(path));
        if (image == null) throw new IOException("Invalid image");
        return image;
    }
}