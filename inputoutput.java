import java.util.Scanner;
/*or
 * import java.utill.*;
 */
public class inputoutput {

    public static void main(String[]args){
        /*user output */
        System.out.println("This sentence will have line break");
        /*System.out.print */
        System.out.print("This will not have break"); 
        System.out.print("this line will continue.\n");
        /*String formatting using System.out.printf
         * %s String%d Integral,%f floating point,%b boolean
         * this will also not break line
         */
        System.out.printf("Hello %s,good morning","world");
        System.out.printf("The number is %d",10);
        /*can use multiple formater */
        System.out.printf("\nThe floating %f and boolean %b","10.3f,false");
        /* User Input
         * import java.utill.Scanner;//copy this line at the top of the code
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("The following take whole sentence");
        String wholeoutput = scan.nextLine();
        System.out.println("the input taken is" + wholeoutput);
        System.out.println("the following takes interger");
        int intInput = scan.nextInt();
        System.out.println("The input taken is" + intInput);
        System.out.println("The following takes double");
        double doubleInput = scan.nextDouble();
        System.out.println("The input taken is " + doubleInput);
        System.out.println("The following takes boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("The input taken is " + booleanInput);
        scan.close(); // you must close the scanner once all input is taken

        /*Task
         * Make a new scanner object scan1
         * Prompt the following and take input 
         * What is your name ? save the input to the string -> name
         * Are you over 18? save the input to the boolean -> status
         * How amny sibling? save the input to the integer -> sibling
         * print the following
         * Hello name,
         * Over 18 ?,Status
         * You have sibling number of sibling
         */

         Scanner scan1 = new Scanner(System.in);
         System.out.println("What is your name?");
         String name = scan1.nextLine();
         System.out.println("Over 18");
         boolean status = scan1.nextBoolean();
         System.out.println("How mant siblings?");
         int sibling = scan1.nextInt();
         System.out.println("Hello"+name);
         System.out.println("Over 18?"+ status);
         System.out.println("You have"+ sibling+"siblings");
         scan1.close();
        
    }
    
}
