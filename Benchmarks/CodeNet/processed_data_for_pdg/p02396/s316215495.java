public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        String s;
        while(!(s = sc.next()).equals("0")){
            System.out.println("Case " + cnt + ": " + s);
            cnt++;
        }
    }
}
