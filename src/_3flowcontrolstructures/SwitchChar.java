package _3flowcontrolstructures;

public class SwitchChar {
    public static void main(String[] args) {
        char charValue='F';
        switch(charValue){

            case 'A':
                System.out.println("A found ");
                break;
            case 'B':
                System.out.println("B found ");
            break;
            case 'C':
                System.out.println("C found ");
                break;
            case 'D':
                System.out.println("D found ");
                break;
            case 'E':
                System.out.println("E found ");
                break;
            default:
                System.out.println("Nothing can be found");
                break;
        }
    }
}
