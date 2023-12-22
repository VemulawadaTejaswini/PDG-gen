import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int sum=0;
		int cnt=0;
		if(n>=(h+w)){
			if(h>w){
				for(int x=0;sum<n;x++){
					sum = sum+h;
					cnt++;
				}
				System.out.println(cnt);
			}else if(w>h){
				for(int y=0;sum<n;y++){
					sum=sum+w;
					cnt++;
				}
				System.out.println(cnt);
			}else{
				int a=h*2-1;
				for(int z=0;sum<n;z++){
					sum=sum+a;
					if(n-sum>h){
						cnt=cnt+2;
					}else{
						cnt=cnt+1;
					}
				}
				System.out.println(cnt);
			}
		}else if(n>=h||n>=w){
			cnt=1;
			System.out.println(cnt);
		}else{
			cnt=0;
			System.out.println(cnt);
		}
	}

}
