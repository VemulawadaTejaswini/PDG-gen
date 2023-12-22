    import java.util.Scanner;
    public class Main{
    public static void main(String args[]){
    int N = 0;
    int L = 0;
    String S[] = new String[100000000];
    char c[] = new char[10000000];
    

    Scanner scan = new Scanner(System.in);
    N = scan.nextInt();
    L = scan.nextInt();
    for(int i=0;i<N;i++){
    S[i] = scan.next();
    c[i] = S[i].charAt(0);
    }
    for(char j=97;j<130;j++){
    	for(int i=0;i<N;i++){
    		if(c[i]==j){
    			System.out.print(S[i]);
    		}
    	}
    }
    
    
    
    }
    }