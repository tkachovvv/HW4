import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Еще рано праздновать совершеннолетие.");
        }
        int schoolStudentAge = 25;
        if (schoolStudentAge >= 7 && schoolStudentAge < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (schoolStudentAge >= 18 && schoolStudentAge <24) {
            System.out.println("Человек уже закончил школу и пора отправлять в университет.");
        }
        if (schoolStudentAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }
        int trainCapacity = 102;
        if (trainCapacity >= 60 && trainCapacity < 102) {
            System.out.println("Извините, сидячих мест больше нет.");
        }
        if (trainCapacity == 102) {
            System.out.println("Извините, вагон полностью забит.");
        }
        }
}