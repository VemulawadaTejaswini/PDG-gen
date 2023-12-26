public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int num = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        boolean judge = (int) Math.sqrt(num) * (int) Math.sqrt(num) == num;
        String result = judge ? "Yes" : "No";
        System.out.println(result);
        sc.close();
    }
}
