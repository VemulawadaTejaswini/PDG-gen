    import java.util.Scanner;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    import java.util.Iterator;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.Random;
    import java.util.Map;
    import java.util.HashMap;
     
    class Main{
    	public static void main(String args[]){
    		Scanner sc = new Scanner(System.in);
    		int N = sc.nextInt();
    		int K = sc.nextInt();
    		int[] num = new int[N];
    		int one=0,count=0;
    		for(int i=0; i<N; i++){
    		    num[i] = sc.nextInt();
    		    if(num[i] == 1){
    		        one = i; 
    		    }
    		}
    		if(one != 0){
    		    count += one / (K-1);
    		    if(one % (K-1) != 0)count ++;
    		}
    		if(one != N-1){
    		    count += (N - (one + 1)) / (K-1);
    		    if((N - (one + 1)) % (K-1) != 0)count++;
    		}
    		System.out.println(count);
    	}
    }