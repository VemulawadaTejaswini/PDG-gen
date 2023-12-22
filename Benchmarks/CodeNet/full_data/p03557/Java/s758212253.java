import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n+1];
    int b[] = new int[n+1];
    int c[] = new int[n+1];
    int nnn = 3 * n;
    a[0] = -1;
    for(int i = 1;i<=n;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    b[0] = -1;
    for(int i = 0;i<n;i++){
      b[i] = sc.nextInt();
    }
    Arrays.sort(b);
    c[0] = -1;
    for(int i = 0;i<n;i++){
      c[i] = sc.nextInt();
    }
    Arrays.sort(c);
    int count = 0;
    //配列をソートしただけやからこっからがんばれな
    for(int j = 1;j<=n;j++){
      //小さいほうのやつ
      int s = 1;
      int t = n;
      while(s < t){
        if(b[j] <  a[(s+t)/2] ){
          t = (s+t)/2 -1;
        }else if(a[(s+t)/2] < b[j]){
          s = (s+t)/2 +1;
        }else{
          t--;
        }
      }
      //でかいほうのやつ
      int p = 1;
      int q = n;
      while(p < q){
        if(b[j] < a[(p+q)/2]){
          q = (p+q)/2 -1;
        }else if(a[(p+q)] < b[j]){
          p = (p+q)/2 +1;
        }else{
          p++;
        }
      }
      count += s*(n-q+1);
    }
    System.out.println(count);
  }
}
