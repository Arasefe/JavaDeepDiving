package _3flowcontrolstructures;
/*
Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
The method should not return any value (hint: void)
Using a switch statement print Sunday, Monday, Saturday if the int parameter day is 0, 1, 6 respectively,
otherwise it should print Invalid day.
Bonus:
	Write a second solution using if then else, instead of using switch.
	Create a new project in IntelliJ with the  name ÅgDayOfTheWeekChallengeÅh

 */
public class SwitchDayOfWeek {
    public static void main(String[] args) {
        dayOfTheWeek();
    }
    public static void dayOfTheWeek(){
        String day="Sunday";
        if(day.equals("Sunday")){
            System.out.println(1);
        }else if(day.equals("Monday")){
            System.out.println(2);
        }else if(day.equals("Tuesday")){
            System.out.println(3);
        }else if(day.equals("Wednesday")){
            System.out.println(4);
        }else if(day.equals("Thursday")){
            System.out.println(5);
        }else if(day.equals("Friday")){
            System.out.println(6);
        }else if(day.equals("Saturday")){
            System.out.println(7);
        }else{
            System.out.println("Invalid value");
        }
    }
    public static void dayOfTheWeek(String day){
        System.out.println((day.equals("Sunday"))?1:(day.equals("Monday"))?2:(day.equals("Tuesday"))?3:(day.equals("Wednesday"))?4:
                (day.equals("Thursday"))?5:(day.equals("Friday"))?6:(day.equals("Saturday"))?7:"Invalid Value");

    }
    public static void dayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
    }
}
