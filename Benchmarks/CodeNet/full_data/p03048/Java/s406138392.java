import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		long ans=0;
		for(int i=0; ; i++){
			if(n-(r*i)<0){
				break;
			}
			for(int j=0; ; j++){
				if(n-(r*i+g*j)<0){
					break;
				}
				if(n-(r*i+g*j)>=0 && (n-(r*i+g*j))%b==0){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
