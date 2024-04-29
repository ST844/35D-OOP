public class ForLoop {
    public static void main(String[] args) {
        /*use for loop when condition is fixed */
        for(int index = 0; index <5; index ++){
            System.out.println("Loop running "+index);
        }
        /*Decrement loop */
        for(int index = 10; index>=0; index --){
            System.out.println("Loop running"+ index);
        }
        /*make the loop table for this */
        /*task
         * make a multiplication table of 2
         * print like the following
         * 2x1=2
         * 2x2=4
         * .
         * .
         * 2x10=20
         * note:initialize 1
         * condition<=10 or <11
         * Increament ++
         */
        for(int index=1; index <=10; index++){
            System.out.println("2x"+index+"="+index*2);
        }
        /*Nested loop */
        for(int outer = 0; outer<3; outer++){
            for(int inner =2; inner>=0; inner --){
                System.out.println("Inner"+ inner);
            }
            System.out.println("Outer"+outer);
        }
        /*Task use nested loop to do the following
         * Make multiplication table from 1-10
         * eg:
         * Multiplication of 1
         * 1 x 1 = 1
         * 1 x 2 = 2
         * .
         * .
         * Multiplication of 10
         * 10 x 1 = 10
         * 10 x 2 = 20
         * .
         * 10 x 10 = 100
         */

         for(int index = 1; index < 10; index ++)
         for(int m =1; m < 11; m++){
            int mul = index * m;
            System.out.println(index +"x"+m+"e"+mul);
            
         }
         System.out.println("Multiplication of " + index);

    }
    
}
