import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

	int N= sc.nextInt();
	int M= sc.nextInt();
	int X= sc.nextInt();
	int a[]=new int[M];
    int cnt=0;
	for(int i=0;i<M;i++){
		a[i]=sc.nextInt();
	        if(a[i]<X){
	            cnt=cnt+1;
	        }
	    
	}

    

	System.out.println(Math.min(cnt,M-cnt));


	}

}
