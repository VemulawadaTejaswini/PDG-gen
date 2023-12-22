import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
        int count = 0;
        
        //初期化
        for(int i = 0; i < n; i++){
		    array[i] = sc.nextInt();
		}
		
		//計算
		for(int i = 0; i < n-2; i++){
		    if(array[i] < array[i+1] && array[i+1] < array[i+2] ||
		       array[i] > array[i+1] && array[i+1] > array[i+2] ){
		        count++;
		    }
		    
		}
		System.out.println(count);
    }
}