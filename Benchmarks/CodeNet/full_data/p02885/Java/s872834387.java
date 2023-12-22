import java.util.Scanner;

public class tocoderA {
	
	static  Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a, b;
        a = in.nextInt();
        b = in.nextInt();
        int ans = 0;
        ans = a - b * 2;
        if(ans < 0) ans = 0;
        System.out.println(ans);
	}

}
