
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	private BufferedReader br;
	private BufferedWriter bw;
	private StringTokenizer st;
	private int a;
	private int b;
	private int c;
	private int sum;
	private boolean check;
	public static void main(String[] args) throws IOException {
		new Main().start();
	}

	void start() throws IOException {

		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());
		
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			c=Integer.parseInt(st.nextToken());
			sum=a;
			for(int i=0;i<=b;i++){
				if(sum%b==c){
					bw.write("YES");
					check=true;
					break;
				}
				sum+=a;
			}
			if(!check){
				bw.write("NO");
			}
			
		bw.flush();
		br.close();
		bw.close();
	}

}
