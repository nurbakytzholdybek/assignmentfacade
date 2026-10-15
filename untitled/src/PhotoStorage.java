import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.*;
import java.util.UUID;

public class PhotoStorage {
    public String save(BufferedImage image) throws IOException {
        Files.createDirectories(Paths.get("gallery"));
        String path = "gallery/" + UUID.randomUUID() + ".png";

        if (!ImageIO.write(image, "png", new File(path))) {
            throw new IOException("Cannot save image");
        }
        return path;
    }
}