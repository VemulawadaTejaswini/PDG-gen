import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        int count  = 0;
        for(int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }
        int a1[] = new int[n*k];
        for(int i = 0; i < n*k; i += n) {
        	for(int j = 0; j < n; j++) {
            	a1[i+j] = a[j];
            }
        }
//        for(int i = 0; i < n*k; i++)
//        	System.out.println(a1[i]);
        for(int i = 0; i < n*k-1; i++) {
            for(int j = 1 + i; j < n*k ; j++) {
            	count += a1[i] > a1[j] ? 1: 0;
            	//System.out.println(a1[i] + ", " + a1[j]);
            }
        }

//      for(int i = 0; i < n-1 ; i++) {
//    	for(int j = 1 + i; j < n; j++) {
//    		count += a[i] > a[j] ? 1: 0;
//    		//System.out.println(a[i] + ", " + a[j]);
//    	}
//    }

        System.out.println((count % (Math.pow(10, 9) + 7)));
	}

}