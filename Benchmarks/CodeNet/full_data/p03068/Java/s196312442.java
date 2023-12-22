import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=Integer.parseInt(sc.next());

		String str=sc.next();
		String x;
		int k=Integer.parseInt(sc.next());

		String[] str2=str.split(""); //一文字ずつ取り出す
		x=str2[k-1];
		for(int i=0;i<str2.length;i++){

			if(str2[i].equals(x)==false){
				str2[i]="*";
			}
		}

		for(int i=0;i<str2.length;i++){

			System.out.print(str2[i]);
		}
		sc.close();

	}

}