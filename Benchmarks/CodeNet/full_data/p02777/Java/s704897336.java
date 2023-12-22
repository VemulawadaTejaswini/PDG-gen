import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		String sa0 = sa[0];
		sa = br.readLine().split(" ");
		int red = Integer.parseInt(sa[0]);
		int blue = Integer.parseInt(sa[1]);
		String u = br.readLine();
		if(u.equals(sa0)) {
			red--;
		}else {
			blue--;
		}
		System.out.println(red+ " " +blue);
		
	}

}
