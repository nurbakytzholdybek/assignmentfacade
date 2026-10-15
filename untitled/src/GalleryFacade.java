import java.io.IOException;
import java.util.List;
import java.awt.image.BufferedImage;

public class GalleryFacade {
    private final PhotoLoader loader = new PhotoLoader();
    private final PhotoEditor editor = new PhotoEditor();
    private final PhotoStorage storage = new PhotoStorage();
    private final AlbumManager albums = new AlbumManager();

    public void upload(String path, String album) throws IOException {
        albums.validate(album);
        BufferedImage image = loader.load(path);
        String savedPath = storage.save(editor.resize(image));
        albums.add(album, savedPath);
    }

    public List<String> getPhotos(String album) {
        return albums.getPhotos(album);
    }
}