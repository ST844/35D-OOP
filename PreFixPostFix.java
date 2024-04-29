public class PreFixPostFix {
    public static void main(String[] args) {
        int PreFixvalue = 10;
        /*Note that the value changes in same line */
        System.out.println(++PreFixvalue);
        System.out.println(PreFixvalue);
        int PostFix=20;
        /*note that the value doesnot change in same line */
        System.out.println(PostFix++);
        System.out.println(PostFix);

    }
}
