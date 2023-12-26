public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int n = X/ 500;
    int count = 0;
    for(int i = 0 ;i <=n && i <= A ;i++){
      int XX = X -500 * i;
      int m = XX/100;
      for(int j = 0;j <= m && j <= B ;j++){
        int XXX = XX - 100 * j;
        if(XXX/50 <= C){
          int p = XXX/50;
          int q = j;
          int r = i;
          count += 1;
        }
      }
    }
  System.out.println(count);
  }
}
