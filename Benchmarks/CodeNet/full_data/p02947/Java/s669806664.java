import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		String s[]=new String[n];
		
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
			char[] c =s[i].toCharArray();
			Arrays.sort(c);
			s[i]=new String(c);
		}
		
		Arrays.sort(s);
		
		long ans =0;
		long count=1;
		
		for(int i=1;i<n;i++){
			if(s[i].equals(s[i-1])) {
				count++;
			}
			else {
				ans+=count*(count-1)/2;
				count=1;
			}
			
		}
		ans+=count*(count-1)/2;
		
        System.out.println(ans);
	}
	
}

	class Data{
		  private int a;
		    private int b;
		    public Data(int a, int b) {
		        this.a = a;
		        this.b = b;
		    }
		    public int getA() {
		        return a;
		    }
		    public int getB() {
		        return b;
		    }
}

	class MyComparator implements Comparator {
		 
	    public int compare(Object obj1, Object obj2) {
	         
	        int num1 = (int)obj1;
	        int num2 = (int)obj2;
	         
	        if(num1 < num2) {
	            return 1;
	        } else if(num1 > num2) {
	            return -1;
	        } else{
	            return 0;
	        }
	    }
	}


