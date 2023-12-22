import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	if(N == 7 || N == 5 || N == 3){
    		System.out.println("YES");
    	}else{
    		System.out.println("NO");
    	}
    }
}