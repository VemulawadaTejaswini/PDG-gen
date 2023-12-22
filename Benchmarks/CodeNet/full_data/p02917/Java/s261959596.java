import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int a[] =new int[n+1];
    int b[] =new int[n];
    int ans = 0;

    for(int i = 0; i < b.length; ++i){
      b[i] = sc.nextInt();
    }
   
   for(int i=0; i<a.length; ++i){
		    a[i]=b[i];
		}
		a[(n+1)]=b[n];
		for(int i=1; i<a.length; ++i){
		    if(a[i]>b[(i-1)]){
		        a[i]=b[(i-1)];
		    }
		}
    
    
    for(int i = 0; i < a.length; ++i){
      ans = ans + a[i];
    }

    System.out.println(ans);
  }
}
