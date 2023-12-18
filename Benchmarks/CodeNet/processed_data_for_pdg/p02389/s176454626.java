public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a_b = sc.nextLine().split(" ");
        int a = Integer.parseInt(a_b[0]);
        int b = Integer.parseInt(a_b[1]);
        int area = a * b;
        int perimeter = (a + b) * 2;
        System.out.println(area + " "  + perimeter);
    }
}
