
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		String[] ana = new String[3];
		ana = line.split(" ");
		int jal[] = new int[3];
		int t = 0;
		for (int i = 0; i < ana.length; i++)
			jal[i] = Integer.parseInt(ana[i]);
		t=jal[0]*100+jal[1]*10+jal[2];
		if(t%4==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}