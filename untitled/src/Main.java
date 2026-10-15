import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        GalleryFacade gallery = new GalleryFacade();

        try {
            gallery.upload(
                    "D:/assignment_bridge/assignmentfacade/untitled/photo.jpg",
                    "Travel"
            );
            System.out.println(gallery.getPhotos("Travel"));
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}