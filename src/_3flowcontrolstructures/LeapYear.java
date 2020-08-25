package _3flowcontrolstructures;

public class LeapYear {
    public static void main(String[] args) {
        boolean result=isLeapYear(2345);
        System.out.println(result);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 != 0);
        return isLeapYear;
    }
}
