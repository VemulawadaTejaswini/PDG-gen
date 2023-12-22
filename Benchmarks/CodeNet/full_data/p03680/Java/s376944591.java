import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0,i=0;
    int[] a=new int[n],b=new int[n];
    b[0]=1;
    for(int j=0;j<n;j++){
      a[j]=sc.nextInt();
    }
    while(f<n){
      b[i]=0;
      b[a[i]-1]++;
      f++;
      i=a[i]-1;
      if(i==1){
        System.out.println(f);
        break;
      }
    }
    if(f==n){
      System.out.println(-1);
    }
  }
}
