import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		char x[]=sc.next().toCharArray();
		int s=0;
		int g=0;
		for (int i = 0; i < x.length; i++) {
		     if(x[i]=='A'){s=i;break;}
		}
		for (int i = 0; i < x.length; i++) {
			 if(x[x.length-i-1]=='Z'){g=x.length-i-1;break;}
		}
		System.out.println(g-s+1);
		
		}
		
	}