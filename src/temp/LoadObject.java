package temp;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadObject {
    public static <T> List<T> readObjects(String filename) {
        List<T> objects = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            while (true) {
                try {
                 //   Serializable obj = (Serializable) ois.readObject();
                   // objects.add(obj);
                    T[] object = (T[]) ois.readObject();
                    System.out.println(Arrays.toString(object));
                    objects.add((T) object);
                } catch (EOFException e) {
                    break; // Конец файла
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objects;
    }
}
