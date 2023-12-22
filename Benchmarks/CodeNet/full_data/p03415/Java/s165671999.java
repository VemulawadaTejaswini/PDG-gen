import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int leng = 3;
		String words[] = new String[leng];

		for(int i=0;i<leng;i++){
			words[i] = sc.next();
		}
		
		System.out.println(words[0].substring(0, 1)+""+words[1].substring(1, 2)+""+words[2].substring(2, 3));
	}
}