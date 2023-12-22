import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	sc.close();
    	long ans = 0;
    	for(int i = 1; i <= n; i++){
    		if(i != a && i != b){
    			ans += calcNumOfCombination(n, i);
    		}
    	}
    	ans = ans % (1000000000+7);
    	System.out.println(ans);
    }

    static int calcNumOfCombination(int n, int r){
        int num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }
}