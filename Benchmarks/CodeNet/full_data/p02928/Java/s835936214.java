import java.util.*;


public class Main{
	public static void main(String args[]){
        int x = 10^9 + 7;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        int[] array2 = new int[n*k];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < k; i++){
            System.arraycopy(array, 0, array2, i*n, n);
        }
        for(int j = 0; j < array2.length-1; j++){
            for(int l = 0; l < array2.length-j-1; l++){
                if(array2[j] > array2[l+1]){
                    System.out.print(j);
                    System.out.println(l);
                    count++;
                }
             }
         }
         
        System.out.print(count % x);
    }
}