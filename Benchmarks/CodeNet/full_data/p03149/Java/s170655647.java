import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int [] n= {0,0,0,0};
		n[0]=sc.nextInt();
		n[1]=sc.nextInt();
		n[2]=sc.nextInt();
		n[3]=sc.nextInt();
		int i;int count=0;
		for(i=0;i<4;i++) {
			if(n[i]==1) {count+=1;}
			if(n[i]==9) {count+=1;}
			if(n[i]==7) {count+=1;}
			if(n[i]==4) {count+=1;}
		}
		if(count==4) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
