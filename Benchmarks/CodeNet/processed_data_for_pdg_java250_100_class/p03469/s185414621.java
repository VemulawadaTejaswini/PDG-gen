public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String result = "2018" + s.substring(4);
        System.out.println(result);
    }
}
