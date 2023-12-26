public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        HashMap<Integer, Boolean> box = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            box.put(i, false);
        }
        for (int i = 0; i < m; i++) {
            int tmpShop = sc.nextInt();
            box.put(tmpShop, true);
        }
        int costRight = 0;
        for (int i = x; i <= n; i++) {
            if ((boolean)box.get(i) == true) costRight++;
        }
        int costLeft = 0;
        for (int i = x; i > 0; i--) {
            if ((boolean)box.get(i) == true) costLeft++;
        }
        System.out.println(Math.min(costLeft, costRight));
    }
}
