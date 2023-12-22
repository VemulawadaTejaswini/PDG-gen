import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[]x = new int[N];
 
    int all = 0;
    for(int i=0; i<N; i++){
        x[i] = sc.nextInt();
        if(x[i]<=K-x[i]) {
        	all += x[i]*2;
        }else {
			all += (K-x[i])*2;
        }	
}  
	System.out.println(all);
    }
}
