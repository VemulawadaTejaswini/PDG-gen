import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] array = line.split(" ");
        int N = Integer.parseInt(array[0]);
        int K = Integer.parseInt(array[1]);

        line = input.nextLine();
        //array = line.split(" ");
        int ans = 0;
        N -= 1;
        K -= 1;
        if(N % K == 0){
        	ans = N / K;
        }else if(N % K != 0){
        	ans = N / K + 1;
        }
        System.out.println(ans);
	}

}
