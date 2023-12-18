public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] inputs = input.split("\\s+");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
}
