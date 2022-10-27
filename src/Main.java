public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
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
        } else {
            System.out.println("Извините, вагон полностью забит.");
        }
        int personsAge = 25;
        if (personsAge <=6 && personsAge >=2) {
            System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить в детский сад.");
        } else if (personsAge <=18 && personsAge >=7) {
            System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить в школу.");
        } else if (personsAge <=24 && personsAge >=18) {
            System.out.println("Если возраст человека равен " + personsAge + ", то ему пора в университет.");
        } else {
            System.out.println("Если возраст человека равен " + personsAge + ", то ему пора на работу.");
        }int childAge = 16;
        if (childAge <5) {
            System.out.println("Ребенку нельзя быть на аттракционе.");
        } else if (childAge >=5 && childAge <14) {
            System.out.println("Ребенку нельзя быть на аттракционе без сопровождения взрослых.");
        } else {
            System.out.println("Ребенку можно быть на аттракционе без сопровождения взрослых.");
        }
        int one = 17;
        int two = 85;
        int three = 84;
        if (one > two && one > three) {
            System.out.println("Самое большое число: " + one);
        }else if (two > one && two > three) {
            System.out.println("Самое большое число: " + two);
        }else if (three > two && three > one) {
            System.out.println("Самое большое число: " + three);
        }

    }
}