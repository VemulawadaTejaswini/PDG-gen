import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		String N = in.nextLine();
		long K = in.nextLong();
		
		if(!N.substring(0, 1).equals("1")) {
			System.out.println(N.substring(0,1));
			System.exit(0);
		}
		if(N.length() >= K) {
			String s = N.substring(0,(int)K);
			int m=1;
			for(int i=1; i<s.length(); i++) {
				m *= 10;
				m += 1;
			}
			if(s.equals(Integer.toString(m))) {
				System.out.println(1);
				System.exit(0);
			}
		}
		for(int j=0; j<N.length(); j++) {
			if(!N.substring(j,j+1).equals("1")) {
				System.out.println(N.substring(j,j+1));
				System.exit(0);
			}
			
		}
		
	
		in.close();
	}
}
