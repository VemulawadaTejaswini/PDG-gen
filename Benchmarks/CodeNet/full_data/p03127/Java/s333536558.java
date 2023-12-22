import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	long ans = sc.nextInt();
    	for(int i = 1; i < N; i++){
    		 ans = gcd(ans, sc.nextInt());
    	}
    	sc.close();
    	System.out.println(ans);
    }

    public static long gcd(long a, long b){
    	if(b > a) return gcd(b, a);
    	else if(b == 0) return a;
    	else return gcd(b, a%b);
    }

}
