import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int[] ary = new int[n];
    	for(int i = 0; i < m; i++){
    		int s = sc.nextInt();
    		int c = sc.nextInt();
    		c = (c == 0) ? 99 : c;
    		if(ary[s-1] == 0){
    			if(c == 99){
    				ary[s-1] = 99;
    			}else{
    				ary[s-1] = c;
    			}
    		}else if(ary[s-1] != 99 && ary[s-1] >= c){
    			ary[s-1] = c;
    		}else{
    			System.out.println(-1);
    			sc.close();
    			return;
    		}
    	}
    	sc.close();
    	for(int i = 0; i < n; i++){
    		if(ary[i] == 99){
    			ary[i] = 0;
    		}
    	}
		if(n == 3 && ary[0] == 0){
			System.out.println(-1);
			return;
		}else if(n == 2 && ary[0] == 0){
			System.out.println(-1);
			return;
		}
    	String str = "";
    	for(int i = 0; i < n; i++){
    		str += String.valueOf(ary[i]);
    	}
    	System.out.println(str);
    }
}