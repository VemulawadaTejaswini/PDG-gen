package abc086;


public class Main086 {

    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]) * Integer.parseInt(args[1]) % 2;
        if (i == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
