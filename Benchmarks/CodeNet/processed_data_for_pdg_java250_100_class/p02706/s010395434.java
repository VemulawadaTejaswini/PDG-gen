public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int n_sum = 0;
    for(int i=0; i<m; ++i) {
      n_sum += sc.nextInt();
    }
    int asobitai = -1;
    if(n >= n_sum) {
      asobitai = n - n_sum;
    }
    System.out.println(asobitai);
  }
}
