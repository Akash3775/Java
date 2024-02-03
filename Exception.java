public class Exception {

    public static void main(String[] arg) {
        System.out.println("program starts ..........");
        try {
            int res = divide(50, 0);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("please enter correct values");
            System.out.println(e);
        }

    }

    public static int divide(int x, int y) {
        return x / y;
    }

}
    

