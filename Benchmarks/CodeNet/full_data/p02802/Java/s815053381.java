import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean[] ac=new boolean[n];
		int[] wa=new int[n];
		
		for(int i=0;i<n;i++) {
			ac[i]=false;
			wa[i]=0;
		}
		
		for(int i=0;i<m;i++) {
			int sub=sc.nextInt()-1;
			String result=sc.next();
			if(ac[sub]){
				continue;
			}else if(result.equals("AC")) {
					ac[sub]=true;
			}else {
					wa[sub]++;
				}
			}
		int acnum=0;
		int wanum=0;
		for(int i=0;i<n;i++){
			if(ac[i]){
				acnum++;
				wanum+=wa[i];
			}
		}
		System.out.println(acnum+" "+wanum);
		sc.close();
	}
}