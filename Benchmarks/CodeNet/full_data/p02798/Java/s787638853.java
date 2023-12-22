import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	int[] b = new int[n];
    	for(int i = 0; i < n; i++){
    		a[i] = sc.nextInt();
    	}
    	for(int i = 0; i < n; i++){
    		b[i] = sc.nextInt();
    	}
    	sc.close();
    	int cnt = 0;
    	int cnt2 = 0;
    	boolean okFlg = false;
    	while(!okFlg){
    		if(checkAry(a)){
    			okFlg = true;
    		}else{
    			for(int i = 0; i < a.length-1; i++){
    	    		if(a[i] > a[i+1]){
    	    			swap(a, b, i);
    	    			cnt++;
    	    		}
    	    	}
    		}
    		if(cnt2 > 100){
    			System.out.println(-1);
    			return;
    		}
    		cnt2++;
    	}
    	System.out.println(cnt);
    }

    public static boolean checkAry(int[] a){
    	for(int i = 0; i < a.length-1; i++){
    		if(a[i] > a[i+1]){
    			return false;
    		}
    	}
    	return true;
    }

    public static void swap(int[] a, int[] b, int i){
    	int tmp;
    	tmp = b[i+1];
    	b[i+1] = a[i];
    	a[i] = tmp;
    	tmp = b[i];
    	b[i] = a[i+1];
    	a[i+1] = tmp;
    }
}