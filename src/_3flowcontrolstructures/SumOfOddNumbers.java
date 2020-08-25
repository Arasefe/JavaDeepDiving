package _3flowcontrolstructures;

public class SumOfOddNumbers {
    public static void main(String[] args) {

    }
    public static int sumOfOddNumbers(int num){
        int sum=0;
        for(int i=0;i<=num;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }

    public static int sumOfEvenNumbers(int num){
        int sum=0;
        for(int i=0;i<=num;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return +sum;
    }
}
