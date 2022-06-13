import java.util.Scanner;

public class App {
    
    
    public static void main(String[] args) throws Exception {

        Scanner celusScanner = new Scanner(System.in);
        System.out.println("Enter a temperature in degrees Celsius");
        System.out.print("Input a degree in Fahrenheit: ");
        

       // String degree = celusScanner.nextLine();

       Scanner input = new Scanner(System.in);
        //int temperature = celusScanner.nextInt();
        double fahrenheit = input.nextDouble();
        double degree = celusScanner.nextDouble();
        
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");


        String name = "This program converts a temperature in degrees Celsius into a "+
        "temperature in degrees Fahrenheit.";

        String bye = "Goodbye...";
        

        System.out.println(name);
        System.out.println(degree);
        System.out.println(bye);
        celusScanner.close();
        input.close();
    }
}
