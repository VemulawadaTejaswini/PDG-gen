import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int n[]=new int[3];
		int t=0;
		int ans=0;
		for(int i=0;i<3;i++){
			n[i]=sc.nextInt();
		}
		for(int i=0;i<n.length-1;i++){
			for(int j=0;j<n.length-i-1;j++){
				if(n[j]>n[j+1]){
					t=n[j];
					n[j+1]=n[j];
					n[j+1]=t;
				}
			}
		}
		ans=n[2]*10+n[1]+n[0];
		System.out.println(ans);
	}

}