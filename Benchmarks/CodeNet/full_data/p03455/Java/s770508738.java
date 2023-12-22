public class EasyMod {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);

        if ((a * b) % 2 == 0) {
          System.out.println("Even");
        } else {
          System.out.println("Odd");
        }
    }
}