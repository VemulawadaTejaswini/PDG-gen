import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
    public void run() throws Exception {
    	int N = sc.nextInt();
    	

    	for(int i=1;i<=9;i++){
    		for(int j=1;j<=9;j++){
    			if(i*j == N){
    				System.out.println("Yes");
    				return;
    			}
    		}
    	}
    	
    	System.out.println("No");
    }
    public static void main(String[] args) throws Exception {
        new Main().run();
    }


}