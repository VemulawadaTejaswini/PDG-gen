public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] input = line.split(" ");
        int v = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        System.out.printf("%d %d%n", v * h, v *2 + h * 2);
    }
}
