public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        int ans = 0;
        for (int i = 0 ; i < n; i ++) {
            int value = sc.nextInt();
            boolean canLookSea = true;
            for(int left : list) {
                if (left > value) {
                    canLookSea = false;
                    break;
                }
            }
            if (canLookSea) {
                ans++;
            }
            list[i] = value;
        }
        System.out.println(ans);
    }
}
