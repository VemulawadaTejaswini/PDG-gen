import java.util.Scanner;

public class HinaArare{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String output = "Tree";

    // 個数の入力
	int num = sc.nextInt();

	String[] color = new String[num];
	// 色の入力
	for(int i = 0; i < num;i++ ) {
		color[i] = sc.next();
	}

	sc.close();

	for(int i = 0;i<num;i++) {
		if(color[i].equals("Y")) {
			output = "Four";
			break;
		}
	}

	System.out.println(output);
}
}