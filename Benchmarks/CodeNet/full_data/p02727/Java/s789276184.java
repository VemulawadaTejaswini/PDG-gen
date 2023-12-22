import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arrA = new int[a];
        int[] arrB = new int[b];
        int[] arrC = new int[c];
        for(int i = 0; i < a; i++)
        	arrA[i] = sc.nextInt();
        for(int i = 0; i < b; i++)
        	arrB[i] = sc.nextInt();
    	for(int i = 0; i < c; i++)
        	arrC[i] = sc.nextInt();
        Arrays.sort(arrA); Arrays.sort(arrB); Arrays.sort(arrC);
        long sum = 0;
        for(int i = 0; i < x; i++) {
        	sum += arrA[a-1-i];
        }
        for(int i = 0; i < y; i++) {
        	sum += arrB[b-1-i];
        }
        int idxA = a - x;
        int idxB = b - y;
        int idxC = c - 1;

        while(idxC >= 0 && ((idxA < a && arrC[idxC] >= arrA[idxA]) 
        || (idxB < b && arrC[idxC] >= arrB[idxB]))) {
        	if(idxA < a && arrC[idxC] >= arrA[idxA]) {
        		sum -= arrA[idxA];
        		sum += arrC[idxC];
        		idxC--;
        		idxA++;
        	} else {
        		sum -= arrB[idxB];
        		sum += arrC[idxC];
        		idxC--;
        		idxB++;
        	}
        }
        System.out.println(sum);
    }
}
