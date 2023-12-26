public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = s.replace("-", "");
        int result = str.length() - (4 - str.length());
        System.out.println(result);
        sc.close();
    }
}
