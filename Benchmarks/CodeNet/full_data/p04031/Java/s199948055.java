import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
	Scanner sc  = new Scanner(System.in);
        
    int cnt = 0;
 
	double  i1 = 0 ,i2 = 0, i3 = 0;
	long L1 = 0, L2 = 0, L3 = 0;
	char ch;
	String str = "";
		
 
 
    int N = Integer.parseInt(sc.next());
    int[] test  = new int[N];
    while(true){
        test[cnt] = Integer.parseInt(sc.next());
        i1 += test[cnt];
        cnt++;
        if(cnt==N)break;
    }
    
    i1 = i1 / cnt;
    if(i1%2==1) i1++;
    int sum=0;
    for(int i=0;i<N;i++){
        sum+=(test[i]-i1)*(test[i]-i1);
    }
 
 
        System.out.print( sum );
        System.out.println();
	}
        
}