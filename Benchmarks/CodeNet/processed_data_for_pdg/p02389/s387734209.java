public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println(area + " " + perimeter);
    }
}
