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
				for(cnt=0;sum<n;cnt++){
					sum = sum+h;
				}
				System.out.println(cnt);
			}else if(w>h){
				for(cnt=0;sum<n;cnt++){
					sum=sum+w;
				}
				System.out.println(cnt);
			}else{
				for(cnt=0;sum<n;cnt++){
					if(h==w){
						sum=sum+h;
						h=h-1;
					}else if(h>w){
						sum=sum+h;
						h=h-1;
					}else{
						sum=sum+w;
						w=w-1;
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
