public class Variable {
    /*
     * Instance varibale
     * Will need object to access this variable
     * Not shared between the object
     */
    int instanceVariable = 100;

    /*
     * Static/Class Variable
     * No need of object, can be called from class
     * Shared between the object
     */
    static int staticVariable = 20;

    public static void main(String[] args) {
        /* Non primitive data type */
        /* Declaration */
        byte bytevalue;
        /* Initialization */
        bytevalue = 100;
        /* Declaration and Initialization */
        short shortValue = 200;
        /* Multiple declaration */
        int intValue1, intValue2;
        intValue1 = 10000;
        intValue2 = 2000;
        /* Multiple declaration and initialization */
        long longVal1 = -90000, longVal2 = 9000;
        float floatValue = 90.90f; // the letter f is needed
        double doubleValue = 100.897d;// the letter d is optional
        char charValue = 'c'; // must use single quote
        boolean booleanValue = false;
        /* Illegal actions below */
        // byte byteValue = 100; //We cannot redeclare the variable
        // bytevalue = 200; //instead use reassignment
        // boolean boolVal2 = 'false';//cannot use different types
        // byte byteValue 2 = 1000000000; // cannot exceed min and max

        /* Non primitive data type */
        String stringValue = "This is a string value";
        /* Using class */
        String stringValue2 = new String("This string uses class");
        System.out.println(stringValue2);
        /* Object, for this we can use the same public class made */
        Variable variableObject = new Variable();
        /* Use object from above to access instance variable */
        System.out.println(variableObject.instanceVariable);
        /* Use class to use static variable */
        System.out.println(Variable.staticVariable);

        /* Typecasting */
        int intValueType = 100;
        double intValueConvertedToDouble = intValueType;
        /* Automatically cast to low data type to high data type */

        /* Explicit casting */
        double doubleVAlueType = 190.8109;
        int doubleValueConvertedToint = (int) doubleValue;
        /*
         * Manually specify data typpe for eg.(int)
         * Note this type cast can only be done in primitive data type
         */

        /*
         * Task
         * MAke one double variable called doubleVar1 = 1000.12
         * Explicitly cast the variable into float, floatVar1
         * Explicitly cast the floatVar1 into int, int Var1
         * MAke a String VAriable with "The integer is"
         * Peing the String variable and print the int variable in another
         */
        double doubleVar1 = 1000.12;
        float floatVar1 = (float) doubleVar1;
        int intVar1 = (int) floatVar1;
        String info = "The integer is";
        System.out.println(info);
        System.out.println(intVar1);

    }

}
