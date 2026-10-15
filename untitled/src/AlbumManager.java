import java.util.*;

public class AlbumManager {
    private final Map<String, List<String>> albums = new HashMap<>();

    public void validate(String album) {
        if (album == null || album.trim().isEmpty()) {
            throw new IllegalArgumentException("Empty album name");
        }
    }

    public void add(String album, String photo) {
        validate(album);
        albums.computeIfAbsent(album.trim(), key -> new ArrayList<>())
                .add(photo);
    }

    public List<String> getPhotos(String album) {
        validate(album);
        return new ArrayList<>(
                albums.getOrDefault(album.trim(), Collections.emptyList()));
    }
}