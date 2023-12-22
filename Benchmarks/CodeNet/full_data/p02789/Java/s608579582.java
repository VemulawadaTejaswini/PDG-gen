public class Main {
    public static void main(String[] argv) {
        int i1 = Integer.parseInt(argv[1]);
        int i2 = Integer.parseInt(argv[2]);
        if (i1 == i2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
