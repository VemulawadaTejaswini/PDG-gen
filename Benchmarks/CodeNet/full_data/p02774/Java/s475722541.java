import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int cnt1 = 0;
        while(sc.hasNextLine()){
          a[cnt1++] = Integer.parseInt(sc.next());
        }
      int[] tmp = new int[a.length*(a.length-1)/2];
    int ans=0;
    int cnt=0;
    for(int i=0;i<a.length-1;i++){
      for(int j=i+1;j<a.length;j++){
        tmp[cnt++] = a[i] * a[j];
      }
    }
    for(int i=0;i<tmp.length;i++){
      int min = Integer.MAX_VALUE;
      for(int j=0;j<tmp.length;j++){
        if( min > tmp[j] ){
          min = tmp[j];
        }
      }
      if( i == k-1 ){
        ans = min;
        break;
      }
      for(int j=0;j<tmp.length;j++){
        if( min == tmp[j] ){
          tmp[j] = Integer.MAX_VALUE;
          break;
        }
      }
    }
    System.out.println(ans);
    }
    
}