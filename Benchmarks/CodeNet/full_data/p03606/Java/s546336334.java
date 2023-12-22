import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),sum=0;
    int[] l=new int[n],r=new int[n],a=new int[n];
    for(int i=0;i<n;i++){
      l[i]=sc.nextInt();
      r[i]=sc.nextInt();
      a[i]=r[i]-l[i]+1;
      sum+=a[i];
    }
    System.out.println(sum);
  }
}
