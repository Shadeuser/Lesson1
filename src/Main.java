public class Main {

    public static void main(String[] args) {
        //Задание 2
        int intValue = 5000;
        byte byteValue = 100;
        long longValue = 1555500045450l;
        float floatValue = 1.01f;
        double doubleValue = 1.001;
        short shortValue = 1000;
        char charValue = 'A';
        boolean booleanValue = true;
        String stringValue = "Hello!";

        System.out.println(returnCalculation(10, 20, 30, 40));
        System.out.println(isValueInLimit(15, 19));
        printName("Александр");
        printConsole(+ 200);
        printThis(isLeapYear(2004));


    }
    //Задание 3
    private static double returnCalculation(double a, double b, double c, double d) {
        return  a * (b + (c / d));
    }
    //Задание 4
    private static boolean isValueInLimit(int a, int b) {
        if (a >= 10 && a <= 20 && b >= 10 && b <=20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 5
    private static void printConsole(int value) {
        if (value >=0 ) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    //Задание 6
    private static boolean isValueNegative(int value) {
        if (value >= 0) {
            return false;
        } else {
            return true;
        }
    }

    //Задание 7
    private static void printName(String name){
        System.out.println("Привет, " + name + "!");
    }

    //Задание 8
    private static boolean isLeapYear (int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private  static void printThis(boolean inBool) {
        System.out.println(inBool);
    }

}
