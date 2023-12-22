import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=Integer.parseInt(sc.next());

		int k=Integer.parseInt(sc.next());

		String str=sc.next();
		String[] str2=str.split(""); //一文字ずつ取り出す
		for(int i=0;i<n;i++){
			if(i!=k-1)System.out.println(str2[i]);
			else System.out.print(str2[i].toLowerCase());
		}

	}

}