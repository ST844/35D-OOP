public class operatorclass {
    public static void main(String[]args) {
        /*Arithemetic operators */
        int a=10,b = 10;
        int sum = a+b; // here the "+" is an arithemitic operators
        System.out.println("Addition for a+b is" + sum);
        System.out.println("Difference for a-b is"+(a-b));
        System.out.println("Multiplication for a*b is"+(a*b));
        System.out.println("Divison for a/b is"+(a/b));
        System.out.println("modulo for a and b is"+(a%2));

        /*Assignment Operators */
        int aNumber1;
        aNumber1 = 10;
        /*or declare and assign */
        int aNumber2 = 20;
        /*assign with another variable */
        int aNumber3 = aNumber1;
        System.out.println("Assignment with +=" +(aNumber1+=10));
        aNumber2 -=30;//same as aNumber2 = aNumber2 - 30;
        System.out.println("Assignment with -="+ aNumber2);

        /*Relational comparison Operators */ 
        int rNumber1 = 10, rNumber2 = 20;
        System.out.println("rNumber equals to rNumber2?"+(rNumber1 == rNumber2));
        System.out.println("rNumber greater than rNumber2?" + (rNumber1>rNumber2));
        System.out.println("rNumber1 less than or euqals to rNumber2?"+(rNumber1<=rNumber2));
        System.out.println("rNumber not euals to rNumber2?" + (rNumber1!=rNumber2));

        /*Logical operator */
        int lNumber1 = 10, lNumber2 = 12;
        boolean lExpression1 = lNumber1 == lNumber2;
        boolean LExpression = lNumber2 <= lNumber2;
        System.out.println("AND operator uses&&"+(lExpression1 && lExpression2));
        System.out.println("OR operator uses||"+(lExpression1|| lExpression2));
        System.out.println("Not operator uses"+!lExpression1);

        /*unary operator */
        int uNumber = 10;
        uNumber++;//meaning uNumber1=uNumber+1:
        System.out.println("Unary for increment is++"+uNumber);
        uNumber--;
        System.out.println("Unary for decrement is --"+uNumber);

        /*ternary operator */
        int tNumber1 = 10,tNumber2=10;
        boolean tExpression = tNumber1==tNumber2;
        /*
         * one line if 
         */

        
        








        String output = tExpression ? "True statement":"False Statement";
        /*Here we can assign a string out with one expression */
        /*if expression is false it will return the value after the":" */
    }
    
}
/*Task1
 * write a program to print weather a variables is greater pr equal to 18
 */
int var = 12;
System.out.println("the variables is grater than 18?"+(var>18));

/*Task2
 * write a program to print simple inetrst from variables
 * make 3 variable for amount,time and rate and save the calculation into avariables
 * formula;
 * si=amount atime a rate/100;
 */
/*

 * write a program to print the area and perimeter of rectangle
 * a= l = b
 * p=2(l+b)
 * p=2(l+b)
 */

 /*task 4 
  * complete the task 1 using ternary operator
 */


 

