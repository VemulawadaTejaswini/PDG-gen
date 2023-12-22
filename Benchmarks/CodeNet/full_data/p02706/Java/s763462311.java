import java.util.Scanner;


public class Main{
	public static void main(String[]args){
  		Scanner stdIn = new Scanner(System.in);
  		int N = Integer.valueOf(stdIn.next());
  		int M = Integer.valueOf(stdIn.next());
  		stdIn = new Scanner(System.in);
  		int Am=0;
  		int [] A=new int [M];
  		for(int i=0;i<M;i++){
  			A[i] = Integer.valueOf(stdIn.next());
  			Am=Am+A[i];
  		}
  		//System.out.println(N+"n"+M+"M" );
		for(int i=0;i<M;i++){
  			//System.out.println(A[i]+"A"+i);
  		}
  		int ret=N-Am;
  		if(ret<=-1)ret=-1;
  		System.out.println(ret);
 	}
 }