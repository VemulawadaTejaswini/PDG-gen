import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int n = scan.nextInt();
	int m = scan.nextInt();
	int[] a = new int[n];
	for(int i = 0; i < n; i++){
	    a[i] = scan.nextInt();
	}
	int[] b = new int[m];
	int[] c = new int[m];
	ArrayList<Integer> D = new ArrayList<Integer>();
	for(int i = 0; i < m; i++){
	    b[i] = scan.nextInt();
	    c[i] = scan.nextInt();
	    for(int j = 0; j < b[i]; j++){
		//System.out.println("now : "+b[i]);
		D.add(c[i]);
	    }
	}
	/*
	for(int i = 0; i < D.size(); i++){
	    System.out.println(D.get(i));
	}
	*/
	//System.out.println("size : "+D.size());

	/* 基本となる数値をソート */
	Arrays.sort(a);
	/* 入れ替える数値列をソート */
	Collections.sort(D, Collections.reverseOrder());

	for(int i = 0; i < n; i++){
	    if(a[i] < D.get(i)){
		a[i] = D.get(i);
	    }else{
		break;
	    }
	}

	long sum = 0;
	for(int i = 0; i < n; i++){
	    sum += a[i];
	}

	System.out.println(sum);
    }
}
