import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		String str="";
		int a_pos=0,b_pos=0,c_pos=0,range=0;

		try {
			str=bfr.readLine();
			if(str.equals("")) {
				System.exit(0);
			}
			else {
				stk=new StringTokenizer(str," ");
				a_pos=Integer.parseInt(stk.nextToken());
				b_pos=Integer.parseInt(stk.nextToken());
				c_pos=Integer.parseInt(stk.nextToken());
				range=Integer.parseInt(stk.nextToken());

				if(Math.abs(a_pos-b_pos)<=range && Math.abs(b_pos-c_pos)<=range) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}

			}
		}catch(IOException e) {

		}
		catch(NumberFormatException ee) {
			System.exit(0);
		}

		catch(NullPointerException eee) {
			System.exit(0);
		}

	}
}