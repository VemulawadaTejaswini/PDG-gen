
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int times = Integer.parseInt(sc.nextLine());
		//int bit = 0;

        String s = sc.nextLine();
        int cnt = 0;

        for(int i=0;i<3;i++){
            char x = s.charAt(i);

            if(x == '1'){
                cnt ++;
            }
        }
        System.out.println(cnt);

	}
}
