mport java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		if(M == 0)System.out.println(0 + " " + 0);
		else if(M == 1) {
			if(sc.next().equals("WA")) {
				System.out.println(0 + " " + 1);
            }else {
            	System.out.println(1 + " " + 0);
            }
		}
		else {
			int c = sc.nextInt(), bc = c, ans = 0, pe = 0;
			String ch=null;
			boolean bb = false;
			
			for(int i = 0; i < M-1; i++) {
				ch = sc.next();
				if(c == bc) {
					if(!bb) {
						if(ch.equals("WA")) {
							pe++;
							System.out.println("p11");
						}else {
							ans++;
							bb = true;
							System.out.println("p12");
						}
					}
					bc = c;
					c=sc.nextInt();
				}else{
						if(ch.equals("WA")) {
							pe++;
							bb = false;
							System.out.println("p21");
						}else {
							ans++;
							bb = true;
							System.out.println("p22");
						}
					
					bc = c;
					c=sc.nextInt();
				}
			}
			System.out.println(ans +" " + pe);
		}
		
	}
	
}
