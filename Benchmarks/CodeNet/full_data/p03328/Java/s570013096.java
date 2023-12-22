import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] get = br.readLine().split(" ");
		int a = Integer.parseInt(get[0]);
		int b = Integer.parseInt(get[1]);

		//List<Integer> tower = new ArrayList<Integer>();

		int s = 1;
		for(int i = 2;i<999;i++){
			s += i;
			if(s>a){
				System.out.println(s-a);
				System.exit(0);
			}
		}



	}

}