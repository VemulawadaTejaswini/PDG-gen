import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),max=0;
    int[] a=new int[n],b=new int[100000];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      b[a[i]]++;
    }
    Arrays.sort(a);
    for(int i=a[0];i<=a[n-1];i++){
      int f=b[i-1]+b[i]+b[i+1];
      max=(int)Math.max(f,max);
    }
    System.out.println(max);
          
  }
}
