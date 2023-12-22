import java.io.*;
         
public class Main {
    public static void main(String[] args){
         
	BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
         
	try{
	    String str1 = reader1.readLine();
	    String str2 = reader2.readLine();
	    int N = Integer.parseInt(str1);
	    String[] s_array = str2.split("\\s");
	    int[] a = new int[N+1];
	    int[] L = new int[N+1];
	    int[] R = new int[N+1];
	    int ak;

	    for(int i = 1 ; i <= N; i++)
		a[i] = Integer.parseInt(s_array[i-1]);
	    
	    int it;
	    for (int k = 1; k <= N; k++) {
		// search to left
		ak = a[k];
		for (it = k; it >= 1; it--) {
		    if (a[it] < ak)
			break;
		}
		L[k] = it;
		// search to right
		for (it = k; it <= N; it++) {
		    if (a[it] < ak)
			break;
		}
		R[k] = it;
	    }

	    // for (int i = 1; i <= N; ++i)
	    // 	System.out.println(L[i] + " " + R[i]);

	    long sum = 0;
	    for (int i = 1; i <= N; ++i) {
		sum += a[i]*(i-L[i])*(R[i]-i);
	    }
	    System.out.println(sum);
         
	}catch (IOException e){
	    System.out.println(e);
	}
    }
}