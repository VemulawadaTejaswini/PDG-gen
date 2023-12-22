import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	int N = sc.nextInt();
    	sc.close();
    	int ans = 0;
    	for(int i = 0; i <= A; i++){
    		for(int j = 0; j <= B; j++){
    			for(int k = 0; k <= C; k++){
    				if((i * 500 + j * 100 + k * 50) == N){
    					ans++;
    				}
    			}
    		}

    	}
    	System.out.println(ans);
    }

}
