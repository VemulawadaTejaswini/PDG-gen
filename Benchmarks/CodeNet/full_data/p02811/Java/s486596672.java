package Main;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Random rand = new Random();
int X = rand.nextInt(100000)+1;
int number = rand.nextInt(100)+1;
int total = 500*number;
if(total >= X) {
	System.out.println("Yes");
}else {
	System.out.println("No");
}
	}

}
