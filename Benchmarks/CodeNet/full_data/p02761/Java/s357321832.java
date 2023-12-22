import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int[] ary = new int[n];
    	boolean isPossible = true;
    	for(int i = 0; i < n; i++){
			ary[i] = -1;
		}
    	for(int i = 0; i < m; i++){
    		int s = sc.nextInt();
    		int c = sc.nextInt();
    		if(ary[s-1] == -1 || ary[s-1] == c){
    			ary[s-1] = c;
    		}else{
    			isPossible = false;
    		}
    	}
    	sc.close();
    	for(int i = 0; i < n; i++){
    		if(ary[i] == -1 && (i == 0 && n != 1)){
    			ary[i] = 1;
    		}else if(ary[i] == -1){
    			ary[i] = 0;
    		}
    	}
		if(n == 3 && ary[0] == 0){
			isPossible = false;
		}else if(n == 2 && ary[0] == 0){
			isPossible = false;
		}
    	String ans = "";
    	for(int i = 0; i < n; i++){
    		ans += ary[i];
    	}
    	System.out.println(isPossible ? ans : "-1");
    }
}