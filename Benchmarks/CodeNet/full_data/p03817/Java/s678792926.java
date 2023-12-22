import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	long x = in.nextLong();
	int[] me = new int[7];

	for(int cnt = 0; cnt < 6; cnt++){
	    me[cnt] = cnt + 1;
	}

	long sum = 0;
	int cnt = 0;
	int y = 1;
	int yd;

	while(sum < x){
		yd = 7 - y;
		int max = me[0];

		for(int c = 1; c < 6; c++){
			int v = me[c];
			if((v > max)&&(v != y)&&(v != yd)){
				max = v;
			}
		}
		y = max;
		sum = sum + y;
		cnt++;
	}
	System.out.println(cnt);

	in.close();

	}

}