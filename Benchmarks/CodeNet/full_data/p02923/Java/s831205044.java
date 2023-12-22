import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] H  = new int[N];
		int max = 0;
		for(int i=0;i<N;i++) {
			H[i] = Integer.parseInt(sc.next());
		}
		int tmp = 0;
		for(int i=0;i<N-1;i++) {
			if(H[i]>=H[i+1]) {
				tmp++;
				if(tmp>max) {
					max=tmp;
				}
			} else {
				tmp = 0;
			}
		}
		System.out.println(max);
	}
}