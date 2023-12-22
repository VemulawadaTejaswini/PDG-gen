import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a = new int[n];
    int max=0;
    int nex=0;
    int pos=0;
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        if(a[i]>nex){
            nex=a[i];
            if(nex>max){
                nex=max;
                max=a[i];
                pos=i;
            }
        }
    }
    for(int i=0;i<n;i++){
        if(i==pos){
            System.out.println(nex);
        }else{
            System.out.println(max);
        }
    }
  }
}
