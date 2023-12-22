import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int a[]=new int[N/2];
		int b[]=new int[N/2];
		int l=N/2;
		for(int i=0;i<N/2;i++) {
			a[i]=in.nextInt();
			b[i]=in.nextInt();
		}		
	    int maxValue=0;
	    int maxCount=0;
	    for (int i = 0; i < a.length; ++i) {
	        int count = 0;
	        for (int j = 0; j < a.length; ++j) {
	            if (a[j] == a[i]) ++count;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxValue = a[i];
	        }
	    }
	    int maxValue2=0;
	    int maxCount2=0;
	    for (int i = 0; i < b.length; ++i) {
	        int count = 0;
	        for (int j = 0; j < b.length; ++j) {
	            if (b[j] == b[i]) ++count;
	        }
	        if (count > maxCount2) {
	            maxCount2 = count;
	            maxValue2 = b[i];
	        }
	    }
	    if(l-maxCount==0&&l-maxCount2==0&&maxValue==maxValue2) {
	    	System.out.println(l);
	    }else {
	    	System.out.println(l-maxCount+(l-maxCount2));	    	
	    }

	}
}
