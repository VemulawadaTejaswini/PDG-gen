import java.io.BufferedReader;
import java.io.InputStreamReader;



class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int r = Integer.parseInt(input[0]);
		int g = Integer.parseInt(input[1]);
		int b = Integer.parseInt(input[2]);
		int a = r * 100 + g * 10 + b;
		if(a % 4 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}