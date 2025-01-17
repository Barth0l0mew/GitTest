import model.Bus;
import model.Student;
import net.datafaker.Faker;
import temp.AppendObject;
import temp.LoadObject;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      // Student student = new Student.BuilderStudent()
      //         .setStudentsRecordBook("")
       //        .setScore(7)
      //         .setNumberGroup("11q")
      //         .build();
     //   System.out.println(student);
//        Faker faker = new Faker();
//        System.out.println(faker.passport().valid());//номер зачетки
//        System.out.println(faker.code().ean8());//номер группы
//        System.out.println(faker.number().randomDouble(1,4,10)); //средний балл
//        System.out.println(faker.brand().car()); //model
//        System.out.println(faker.expression("#{bothify '??-####','true'}"));// Номер машины
//        System.out.println(faker.expression("#{bothify '??-####','true'}"));
//        System.out.println(Arrays.toString(Student.randomStudents(10)));
//        SaveObjectToFile.saveToFile(Student.randomStudents(1), "student.dat",true);

 //       SaveObjectToFile.saveToFile(Student.randomStudents(1), "student.dat",true);
        AppendObject.saveObject("studbus.dat",Student.randomStudents(2));
        System.out.println(Arrays.toString(Bus.randomBus(3)));
        AppendObject.saveObject("studbus.dat",Bus.randomBus(5));
        System.out.println("=====");
        //LoadObject.readObjects("stud.dat");
        System.out.println(LoadObject.readObjects("studbus.dat"));
        for (Object el :LoadObject.readObjects("studbus.dat")){
            System.out.println(el.getClass());
            System.out.println(Arrays.toString((Object[]) el));
        }
        //System.out.println(Arrays.toString(LoadFileToObject.loadObject(Student.class)));
        //System.out.println(LoadFileToObject.loadObject(Student.class));
   //     System.out.println(LoadFileToObject.loadObject("student.dat"));
      //  System.out.println(Arrays.toString(LoadFileToObject.loadObject("student.dat")));
//        Student[] students = (Student[])LoadFileToObject.loadObject();
//        System.out.println(students[1].getNumberGroup());
    }

    public static void printNewBranch() {
        System.out.println("New branch");
    }
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите пункт");
            System.out.println("1 - загрузка с файла");
            System.out.println("2 - загрузка рандомная");
            System.out.println("3 - загрузка пользовательсяка");
            System.out.println("4 - вывод массива");
            System.out.println("0 - выход");
            String input = scanner.nextLine();
            try {
                int index = Integer.parseInt(input);
                switch (index) {
                    case 1: {
                        System.out.println("1");
                        break;
                    }
                    case 2: {
                        System.out.println("2");
                        break;
                    }
                    case 3: {
                        System.out.println("3");
                        break;
                    }
                    case 4: {
                        OutputArray.printArray();
                    }
                    case 0: {
                        return;
                    }
                    default:
                        System.out.println("not found");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input number is invalid");
            }

        }
    }
}