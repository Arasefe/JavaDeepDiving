package _3flowcontrolstructures;
/*
Create a for statement using a range of numbers from 1 to 1000 inclusive.
Sum all the numbers that can be divided with both 3 and also with 5.
For those numbers that met the above conditions, print out the number.
break out of the loop once you find 5 numbers that met the above conditions.
After breaking out of the loop print the sum of the numbers that met the above conditions.
 */

public class SumThreeAndFive {
    public static void main(String[] args) {
        System.out.println(sumThreeAndFive(345));
    }
    public static int sumThreeAndFive(int num){
        int count=0;
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%3==0&&i%5==0){
                sum+=i;
                count++;
                System.out.println("Found number is "+i);
            }
            if(count==5){
                break;
            }
        }
        return sum;
    }
}
