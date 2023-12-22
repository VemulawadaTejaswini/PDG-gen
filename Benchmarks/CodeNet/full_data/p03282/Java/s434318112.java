import java.util.Scanner;
public class Main {

    
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		long K = sc.nextLong();
		double days  = 5*Math.pow(10, 15);
		StringBuffer buffer = new StringBuffer(s);
		for(int i=0;i<buffer.length();i++) {
			long count=K;
			int n = Integer.parseInt(buffer.charAt(i)+"");
			double m = Math.pow(n, days);
			if (count<=m) 
			{System.out.println(n);
				break;}
			else {
				count=(long) (m+count);
			}
		}
		

	}

}
