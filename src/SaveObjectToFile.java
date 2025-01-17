import model.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SaveObjectToFile {
    public static <T> void saveToFile(T[] student, String pathName,boolean append) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathName,append))) {
            oos.writeObject(student);
            System.out.println(Arrays.toString(student));
            System.out.println("Объект сохранен в файл");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
