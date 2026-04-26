import java.io.FileWriter;
import java.io.File;
public class writer {
    public static void main(String[] args) {
        File myObj = new File("index.html");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
