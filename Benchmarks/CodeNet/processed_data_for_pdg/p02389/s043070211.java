public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int area = a * b;
        int perimeter = a*2 + b*2;
        System.out.println(area + " " + perimeter);
    }
}
