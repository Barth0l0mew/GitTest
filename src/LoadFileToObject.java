//import model.Student;

import java.io.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class LoadFileToObject {
    public static <T> T[] loadObject2(String pathName){
        T[] objects = null;
        try (ObjectInputStream ois =new ObjectInputStream(new FileInputStream(pathName))){
                int length = ois.readInt();
           T[] object = (T[])ois.readObject();
            System.out.println(object);
//            System.out.println(Arrays.toString(object));
//             object = (T[])ois.readObject();
//            System.out.println(Arrays.toString(object));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public static <T> T[] loadObject(String pathName) {
        classChecked();
        T[] objects = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathName))) {

            Object object = ois.readObject();
            objects = (T[]) object;

        } catch (
                FileNotFoundException e) {
            System.out.println("Такого файла не существует");
        //    throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Данный класс отсутствует в директори model");
            return objects;
            //throw new RuntimeException(e);
        }
        return objects;
    }

    private static boolean classChecked() {
        String directoryPath = "src/model";
        File directory = new File(directoryPath);
        if (!directory.isDirectory()) {
            System.out.println("Директория не существует");
            return false;
        }
        for (File file : directory.listFiles()) {
            System.out.println("file name " + file.getName());
            System.out.println();
        }
        return false;
    }


}
