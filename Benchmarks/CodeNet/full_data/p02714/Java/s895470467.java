import java.util.*;
public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		String s =sc.next();
		int t=0;
		int r=0;
		int b=0;
		int g=0;
		for(int i=0;i<c;i++) {
		if(s.charAt(i)=='R') {
			r++;
		}else if(s.charAt(i)=='B') {
			b++;
		}else {
			g++;
		}
		
	  }
		long z=g*b*r;
		for(int i=0;i<c-2;i++) {
			for(int j=i+1;j<c-1;j++) {
				int k=2*j-i;
					if(k<c&&s.charAt(i)!=s.charAt(j)&&s.charAt(i)!=s.charAt(k)&&
								s.charAt(k)!=s.charAt(j)) {
							t++;
						
					
				}
			}
		}
		
		System.out.println(z-t);



	}

}
