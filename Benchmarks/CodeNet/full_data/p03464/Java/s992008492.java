import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int[] a = new int[k];
    for(int i=0;i<k;i++)a[i]=sc.nextInt();
    int[] l = new int[k+1];
    int[] r = new int[k+1];
    l[k]=2;
    r[k]=2;
    for(int i=k;i>0;i--){
      if(r[i]%a[i-1]!=0&&l[i]%a[i-1]!=0&&(r[i]-l[i])<a[i-1]){
        System.out.println(-1);
        return;
      }
      l[i-1]=(int)Math.ceil((double)l[i]/a[i-1])*a[i-1];
      r[i-1]=(int)Math.floor((double)r[i]/a[i-1])*a[i-1]+a[i-1]-1;
    }
    System.out.println(l[0]+" "+r[0]);
  }
}