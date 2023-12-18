public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        ArrayList<Integer> A = new ArrayList<Integer>();
        for (;;) {
            x = sc.nextInt();
            if (x != 0) {
                A.add(x);
            }
            else {
                for (int j=0; j<A.size(); j++) {
                    System.out.printf("Case %d: %d\n", j+1, A.get(j));
                }
                break;
            }
        }
    }
}
