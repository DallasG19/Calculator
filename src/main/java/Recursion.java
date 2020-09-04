import java.util.Scanner;
import static java.lang.Math.sqrt;


public class Recursion {

    ///////////////////////////////////////////////////////////////
    public static int addition(int x, int y){
        if(x == 0)
            return(y);

        else
            return (addition(x,y-1) + 1);
    }
    ////////////////////////////////////////////////////////////////
    public static int subtraction(int x, int y){

        if (x == 0)
            return(y);
        else
            return(subtraction(x, y-1) - 1);
    }
    ////////////////////////////////////////////////////////////////
    public static int multiplication(int x, int y){

        if (y == 1)
            return(x);
        else
            return(x + multiplication(x, y-1));
    }
    ////////////////////////////////////////////////////////////////
    public static int division(int x, int y){

        if(y == 1)
            return(x);
        else
            return(x + division(x, y - 1));

    }
    ////////////////////////////////////////////////////////////////
    public static int power(int x, int y){
        if(y==0)
            return(1);
        else
            return (x * power(x, y-1));

    }
    ////////////////////////////////////////////////////////////////
    public static int factorial(int x){
        if(x == 0)
            return(1);
        else
            return (x * factorial(x-1));
    }
////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        int x;
        int y;
        String clear;
        String calculation;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Welcome to my calculator");
            System.out.println("Select one of the following operations: ");
            System.out.println("+ for addition");
            System.out.println("- for subtraction");
            System.out.println("* for multiplicatoin");
            System.out.println("/ for division");
            System.out.println("^ for exponet");
            System.out.println("! for factorial");
            System.out.println("r for square root");
            System.out.println("s for square");
            System.out.println("q for quit");
            calculation = input.nextLine();

            switch (calculation.charAt(0)){

                case'+': System.out.println("The equation is (x+y)");
                    System.out.println("Enter x: ");
                    x = input.nextInt();
                    System.out.println("Enter y: ");
                    y = input.nextInt();
                    System.out.println("The answer is " + (x + y) );
                    clear = input.nextLine();
                    break;

                case'-': System.out.println("The equation is (x-y)");
                    System.out.println("Enter x: ");
                    x = input.nextInt();
                    System.out.println("Enter y: ");
                    y = input.nextInt();
                    System.out.println("The answer is " + (x - y) );
                    clear = input.nextLine();
                    break;

                case'*': System.out.println("The equation is (x*y)");
                    System.out.println("Enter x: ");
                    x = input.nextInt();
                    System.out.println("Enter y: ");
                    y = input.nextInt();
                    System.out.println("The answer is " + (x * y) );
                    clear = input.nextLine();
                    break;

                case'/': System.out.println("The equation is (x/y)");
                    System.out.println("Enter x: ");
                    x = input.nextInt();
                    System.out.println("Enter y: ");
                    y = input.nextInt();
                    System.out.println("The answer is " + (x / y) );
                    clear = input.nextLine();
                    break;

                case'^': System.out.println("The equation is (x^y)");
                    System.out.println("Enter x: ");
                    x = input.nextInt();
                    System.out.println("Enter y: ");
                    y = input.nextInt();
                    System.out.println("The answer is " + power(x,  y) );
                    clear = input.nextLine();
                    break;

                case'r': System.out.println("The equation is (√x)");
                    System.out.println("Enter x: ");
                    x = input.nextInt();
                    System.out.println("The answer is " + sqrt(x));
                    clear = input.nextLine();
                    break;

                case's': System.out.println("The equation is (x*x)");
                    System.out.println("Enter x: ");
                    x = input.nextInt();
                    System.out.println("The answer is " + x*x);
                    clear = input.nextLine();
                    break;

                case'!': System.out.println("The equation is (x!y)");
                    System.out.println("Enter x: ");
                    x = input.nextInt();
                    System.out.println("The answer is " + factorial(x) );
                    clear = input.nextLine();
                    break;

                case'i': System.out.println("The equation is (1/x)");
                    System.out.println("Enter x: ");
                    x = input.nextInt();
                    System.out.println("The answer is " + (1 / x) );
                    clear = input.nextLine();
                    break;
            }
        }
        while(calculation != "q");
        System.out.println("Goodbye");
    }
}
