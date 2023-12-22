import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    int cntr=0;
    for(int i=0;i<n;i++){
      x-=a[i];
      if(x>0){
        cntr++;
      }else{
        break;
      }
    }
    System.out.println(cntr);
  }
}