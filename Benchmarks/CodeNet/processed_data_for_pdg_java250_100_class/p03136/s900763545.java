public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    int[] len = new int[n];
    for (int i=0;i<n;i++) {
      len[i] = cin.nextInt();
    }
    Arrays.sort(len);
    int max = len[len.length-1];
    int sum = 0;
    for (int i=0;i<n-1;i++) {
      sum+=len[i];
    }
    if (max < sum) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}
