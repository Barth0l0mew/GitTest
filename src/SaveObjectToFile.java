import model.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveObjectToFile {
    public static void saveToFile (Student[] student){
       try  (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"))){
            oos.writeObject(student);
           System.out.println("model.Student data saved");
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}
