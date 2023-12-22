import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;

		try {
			str=bfr.readLine();

			if(str.equals("")) {
				System.exit(0);
			}

			else {
				int gatu,nichi;
				stk=new StringTokenizer(str," ");
				gatu=Integer.parseInt(stk.nextToken());
				nichi=Integer.parseInt(stk.nextToken());

				if(gatu<=nichi) {
					System.out.println(gatu);
				}

				else if(gatu>nichi) {
					System.out.println(gatu-1);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException ee) {
			System.exit(0);
		}

		catch(NullPointerException eee) {
			System.exit(0);
		}

	}
}