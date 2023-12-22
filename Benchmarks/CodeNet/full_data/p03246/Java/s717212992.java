

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] KV=new int[100001];
	    int[] GV=new int[100001];
	    int[] V= new int[N];

        for(int i=0; i<N;i++) {
        	int a=gi();
        	V[i]=a;
        	if((i+1)%2==1) {
        		KV[a]++;
        	} else {
        		GV[a]++;
        	}
        }
        
        if(KV[V[0]]==Math.ceil(N/2) && GV[V[1]]==Math.floorDiv(N,2) && V[0]!=V[1]) {
        	System.out.print(0);
			return;
		}
	    
        Arrays.parallelSort(KV);
        Arrays.parallelSort(GV);
        long ans=0;
        if (KV[100000]==GV[100000]) {
        	if(KV[99999]>GV[99999]) {
        		if (N%2==0) {
            		ans=(N/2-KV[99999]) + (N/2-GV[100000]);
            	} else {
            	    ans=((N+1)/2-KV[99999]) + ((N-1)/2-GV[100000]);
            	}
        	} else {
        		if (N%2==0) {
            		ans=(N/2-KV[100000]) + (N/2-GV[99999]);
            	} else {
            	    ans=((N+1)/2-KV[100000]) + ((N-1)/2-GV[99999]);
            	}
        	}
        } else {
        	if (N%2==0) {
        		ans=(N/2-KV[100000]) + (N/2-GV[100000]);
        	} else {
        	    ans=((N+1)/2-KV[100000]) + ((N-1)/2-GV[100000]);
        	}
        }
	    System.out.print(ans);
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}