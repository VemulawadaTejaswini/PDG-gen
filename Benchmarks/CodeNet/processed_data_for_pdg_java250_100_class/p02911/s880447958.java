public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        final int N = Integer.valueOf(line1[0]);
        final int K = Integer.valueOf(line1[1]);
        final int Q = Integer.valueOf(line1[2]);
        int[] userPt = new int[N];
        for (int i = 0; i < userPt.length; i++) {
            userPt[i] = K - Q;
        }
        for (int i = 0; i < Q; i++) {
            int userI = Integer.valueOf(sc.nextLine()) -1;
            userPt[userI] += 1;
        }
        for (int anUserPt : userPt) {
            if (anUserPt <= 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
