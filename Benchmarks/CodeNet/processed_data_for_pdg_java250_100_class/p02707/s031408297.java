public class Main {
    static final int MOD = 1_000_000_007; 
    static final int INF = 1_000_000_000; 
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for(int i = 0;i < n-1;i++){
            ary[sc.nextInt()-1]++;
        }
        for(int i = 0;i < n;i++){
            System.out.println(ary[i]);
        }
    }
}
