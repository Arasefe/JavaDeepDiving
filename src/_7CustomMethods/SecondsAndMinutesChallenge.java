package _7CustomMethods;
/*
Create a method called getDurationString with two parameters, minutes and seconds.Validate that the first parameter minutes is >= 0.
And the 2nd parameter seconds is >= 0 and <= 59. The method should return Invalid value in the method if either of the above are not true.
If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format XXh YYm ZZs where XX represents a number of hours, YY the minutes and ZZ the seconds.
Create a 2nd method of the same name but with only one parameter seconds. Validate that it is >= 0, and return Invalid value if it is not true.
If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method
passing the correct minutes and seconds calculated so that it can calculate correctly.
Call both methods to print values to the console.
 */
public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        //System.out.println(getDurationString(65,23));
        System.out.println(getDurationString(234));
    }
    public static String getDurationString(int minutes, int seconds){
        if((minutes<0)||seconds<0||seconds>59){
            return "Invalid Value";
        }
        int hours=minutes/60;
        int remainingMinutes=minutes%60;
        return hours+"h "+remainingMinutes+"m "+seconds+"s";
    }
    public static String getDurationString(int seconds){                // method overloading
        if(seconds<0){
            return "Invalid Value";
        }
        int minutes=seconds/60;
        int remainingSeconds=seconds%60;
        return getDurationString(minutes,remainingSeconds);

    }
}
