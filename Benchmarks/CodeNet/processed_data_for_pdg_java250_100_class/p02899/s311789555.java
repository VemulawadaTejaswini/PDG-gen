public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        int idx = 1;
        for (int x : a) {
            map.put(x, idx);
            idx++;
        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }
}
