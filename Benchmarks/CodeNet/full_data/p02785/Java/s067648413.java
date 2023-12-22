import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int[] ary = new int[n];
    	long sum = 0;
    	for(int i = 0; i < n; i++){
    		ary[i] += sc.nextInt();
    	}
    	sc.close();
    	Arrays.sort(ary);
    	int len = ary.length;
    	if(k > len){
    		System.out.println(sum);
    		return;
    	}
    	int t = n-1;
    	for(int i = 0; i < k; i++){
    		ary[t] = 0;
    		t--;
    	}
    	for(int i = 0; i < len; i++){
    		sum += ary[i];
    	}
    	System.out.println(sum);
    }
}