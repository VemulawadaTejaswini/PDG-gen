import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner cd = new Scanner(System.in);
		String[] fd = cd.nextLine().split("");
		cd.close();
		int co=1;
		String h = "";
		for(int i=0;i<fd.length;++i) {
			if(co%2==1) h=h+fd[i];
			++co;
		}
		System.out.println(h);
	}

}
