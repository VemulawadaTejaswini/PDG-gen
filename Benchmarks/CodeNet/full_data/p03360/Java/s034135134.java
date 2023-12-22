import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;

		int a,b,c=0;

		try {
			str=bfr.readLine();

			if(str.equals("")) {
				System.exit(0);
			}

			else {
				stk=new StringTokenizer(str," ");
				a=Integer.parseInt(stk.nextToken());
				b=Integer.parseInt(stk.nextToken());
				c=Integer.parseInt(stk.nextToken());

				str=bfr.readLine();

				if(str.equals("")) {
					System.exit(0);
				}

				int kaisu=Integer.parseInt(str);


				int max_coffee=Math.max(a, Math.max(b,c));
				if(a==max_coffee) {
					for(int i=0; i<kaisu; i++) {
						a*=2;
					}
				}

				else if(b==max_coffee) {
					for(int i=0; i<kaisu; i++) {
					b*=2;
					}
				}

				else if(c==max_coffee) {
					for(int i=0; i<kaisu; i++) {
						c*=2;
					}
				}
				System.out.println(a+b+c);
			}
		}catch(IOException e) {
			System.exit(0);
		}

		catch(NumberFormatException ee) {
			System.exit(0);
		}

		catch(NullPointerException eee) {
			System.exit(0);
		}
	}
}