import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private BufferedReader br;
	private int n,m,sum;
	private int[] time;
	private StringTokenizer st;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		new Main().start();
	}
	private void start() throws IOException{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		time=new int[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			time[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n-1;i++){
			if(time[i+1]-time[i]<m){
				sum+=time[i+1]-time[i];
			}
			else{
				sum+=m;
			}
		}
		System.out.println(sum+m);
	}
}
