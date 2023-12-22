import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    Integer[] a = new Integer[m];//使えない階段の番号
    Integer[] b = new Integer[n];
    boolean j0,j1,j2 ;
    int count = 0;

    for(int i=0; i<m; i++){
      a[i] = sc.nextInt();
    }
    b[0] = 1;//1段目
    b[1] = 1;//2段目
    for(int i=2;i<n;i++){
      j1 = Arrays.asList(a).contains(i);
      j2 = Arrays.asList(a).contains(i-1);
      if(j1 && j2){
        count = 1;
        break;
      }else if(j1 && !j2){
        b[i] = b[i-2];
        b[i] = b[i]%1000000007;
      }else if(!j1 && j2){
        b[i] = b[i-1];
        b[i] = b[i]%1000000007;
      }else{
        b[i] = b[i-1] + b[i-2];
        b[i] = b[i]%1000000007;
      }

    }
    if(count == 1){
      System.out.println("0");
    }else{
      System.out.println(b[n-1]);
    }

  }
}