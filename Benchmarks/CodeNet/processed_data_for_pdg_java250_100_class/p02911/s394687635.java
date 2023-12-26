public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] points = new int[n];
        int k = sc.nextInt(); 
        int q = sc.nextInt(); 
        for (int i = 0; i < q; i++) {
            int ok_i = (sc.nextInt() - 1); 
            points[ok_i]++;
        }
        for (int i = 0; i < n; i++) {
            if (q - points[i] >= k) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
