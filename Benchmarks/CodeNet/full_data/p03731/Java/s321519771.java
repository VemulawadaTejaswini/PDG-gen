import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  int T = sc.nextInt();
	  long sum=0;
	  long tw[] ={};
	  for(int i=0;i<N;i++) {
		  tw[i]=sc.nextLong();
	  }


	  for(int i=0;i<N;i++) {
		  if(i==0)continue;
		  if(tw[i]<T)sum += tw[i];
		  else sum+= T;
		  if(i==N-1) {
			  sum+=T;
			  break;
		  }
	  }
	  System.out.print(sum);
	  sc.close();
    }
}