public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        final int N = s.nextInt();
        final int K = s.nextInt();
        Set nSet = new HashSet();
        int[] kHoji;
        for (int i = 0 ; i < K ; i++) {
            int kNum = s.nextInt();
            kHoji = new int[kNum];
            for (int j = 0 ; j < kHoji.length ; j++) {
                nSet.add(s.nextInt());
            }
        }
        System.out.println(N - nSet.size());
  }
}
