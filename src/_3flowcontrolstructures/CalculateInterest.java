package _3flowcontrolstructures;

public class CalculateInterest {
    public static void main(String[] args) {
        System.out.println("$ 10,000 at 2% interest rate = "+calculateInterest(10000,2));
        System.out.println("$ 20,000 at 3% interest rate = "+calculateInterest(20000,3));
        System.out.println("$ 30,000 at 4% interest rate = "+calculateInterest(30000,4));
        System.out.println("$ 40,000 at 5% interest rate = "+calculateInterest(40000,5));
        System.out.println("$ 50,000 at 6% interest rate = "+calculateInterest(50000,6));

        /*
        Using the for loop call calculateInterest method with the amount of 10000 and interest rate 2, 3,4,5,6,7,8
        and print the results to the console
         */
        for(int i=2;i<8;i++){
            System.out.println("$10000 at "+i+"% interest rate ="+String.format("%.2f",calculateInterest(10000,i)));
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return amount*interestRate/100;
    }
}
