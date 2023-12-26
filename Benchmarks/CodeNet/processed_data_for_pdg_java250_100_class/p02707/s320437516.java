public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n  = in.nextInt();
        int[] mem = new int[n];
        for (int i = 0 ; i < n-1; i++) {
            mem[Integer.parseInt(in.next()) - 1 ] ++;
        }
        for (int i : mem) {
            System.out.println(i);
        }
    }
}
