import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
	  int n = sc.nextInt();
      int[] a = new int[n+1];
      int[] mate = new int[n+1];
      for(int i=1;i<=n;i++){
      	a[i] = sc.nextInt();
      }
     for(int i=1;i<=n;i++){
     	mate[a[i]] = i;
     }
      
    for(int i=1;i<=n;i++){
      	System.out.print(mate[i] + " ");
      }
      
     
    }
}