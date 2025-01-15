import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class LoadFileToObject {
    public static <T> T[] loadObject(Class<T> objectClass) {
        T[] objects = null;
        try (ObjectInputStream ois = new ObjectInputStream( new FileInputStream("data.dat"))) {
            //model.Student[] object = (model.Student[]) ois.readObject();
            Object object = ois.readObject();
            objects = (T[]) object;
            System.out.println(object.toString());
           // System.out.println(Arrays.toString(object));
            System.out.println(object.getClass().getName());

        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return objects;
    }
    private static boolean classChecked (){
        String fileDirectory = "model";

    }


}
