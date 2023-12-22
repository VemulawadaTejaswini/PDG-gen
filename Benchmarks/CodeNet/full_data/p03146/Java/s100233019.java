import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[1000000];
      int count=1;
      while(true){
        count++;
      	if(n%2==0){
          n/=2;
          if(a[n-1]==0)
          	a[n-1]++;
          else {
            System.out.println(count);
            break;
          }
        }
        else{
          n=3*n+1;
          if(a[n-1]==0)
          	a[n-1]++;
          else {
            System.out.println(count);
            break;
          }
        }
      }
	}
}
