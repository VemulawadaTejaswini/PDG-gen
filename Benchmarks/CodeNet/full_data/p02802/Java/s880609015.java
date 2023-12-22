import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	if(m == 0){
    		System.out.println("0" + " " + "0");
    		System.exit(0);
    	}
    	int[] iAry = new int[m];
    	String[] sAry = new String[m];
     	int[] ans = new int[2];
    	for(int i = 0; i < m; i++){
    		iAry[i] = sc.nextInt();
    		sAry[i] = sc.nextLine().trim();
    	}
    	sc.close();
    	int mCnt = 1;
    	for(int i = 0; i < m; i++){
    		if(iAry[i] == mCnt){
    			if(sAry[i].equals("AC")){
    				ans[0]++;
    				mCnt++;
    			}else if(sAry[i].equals("WA")){
    				ans[1]++;
    			}
    		}
    	}
    	System.out.println(ans[0] + " " + ans[1]);
    }
}