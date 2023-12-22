import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int n = sc.nextInt();
    	//String l = sc.next();
    	//int arg[] = new int[n];
    	int tmp = 0;
    	int max = 0;
    	int sum = 0;

    	for(int i = 0; i < n; i++){
    		//arg[n] = sc.nextInt();
    		tmp = sc.nextInt();
    		if (tmp > max){
    			max = tmp;
    		}
    		sum += tmp;

    	}

    	String ans ="";
    	if(max < (sum - max)){
    		ans = "Yes";
    	} else {
    		ans = "No";
    	}
    	// 出力
    	System.out.println(ans);
    }
}