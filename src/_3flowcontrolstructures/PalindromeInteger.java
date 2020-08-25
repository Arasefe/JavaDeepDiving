package _3flowcontrolstructures;

public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(86293));
        System.out.println(isPalindrome(6776));
    }
    public static boolean isPalindrome(int number){
        int original=number;
        int reversedNum=0;
        while(number>0){
            int lastDigit=number%10;
            number/=10;
            reversedNum=reversedNum*10+lastDigit;
        }
        if(original==reversedNum){
            return true;
        }else{
            return false;
        }
    }
}
