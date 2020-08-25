package _3flowcontrolstructures;
/*
Write a method with the name sumDigits that has one int parameter called number.
If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to
indicate an invalid value. The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to
process negative numbers, so also return -1 for negative numbers.For example calling the method sumDigits(125)
should return 8 since 1 + 2 + 5 = 8. Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and
invalid values passed as arguments.
Hint:
	Use n % 10 to extract the least-significant digit.
	Use n = n / 10 to discard the least-significant digit.
	The method needs to be static like other methods so far in the course.
 */
public class DigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is "+sumOfDigits(125));
        System.out.println("The sum of the digits in number -125 is "+sumOfDigits(-125));
        System.out.println("The sum of the digits in number 4 is "+sumOfDigits(4));
        System.out.println("The sum of the digits in number 987 is "+sumOfDigits(987));
        System.out.println("The sum of the digits in number 10 is "+sumOfDigits(10));
    }
    public static int sumOfDigits(int number){
        int sum=0;
        if(number<10){
            return -1;
        }
        while(number>0){
            // extract the least-significant digit
            int lastDigit=number%10;
            sum+=lastDigit;
            // drop the least-significant digit
            number/=10;

        }
        return sum;
    }
}
