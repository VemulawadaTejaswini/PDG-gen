import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	sc.close();
    	long ans = 0;
    	for(int i = 1; i <= N; i++){
    		if(i % 3 != 0 && i % 5 != 0){
    			ans+=i;
    		}
    	}
    	System.out.println(ans);
    }
}