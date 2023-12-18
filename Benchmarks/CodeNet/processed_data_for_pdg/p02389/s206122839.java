public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        int area = x * y;
        int distance = (x + y) * 2;
        System.out.println(area +" "+ distance);
    }
}
