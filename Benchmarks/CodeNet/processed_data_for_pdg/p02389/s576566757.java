public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] inputs = input.split("\\s+");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        System.out.println((a * b) + " " + (a * 2 + b * 2));
    }
}
