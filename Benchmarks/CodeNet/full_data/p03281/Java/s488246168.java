import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int cou = 0;
    int ans = 0;
    for(int i=1; i<=N; i+=2) {    
    	for(int j=1; j<=N; j++) {
    		if(i%j== 0) {
    			cou++;
    	if(cou==8) {
    		ans++;
    	}
    }
   }
}
    	System.out.println(ans);
      }
}

