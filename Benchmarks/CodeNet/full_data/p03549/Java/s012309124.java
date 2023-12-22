import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t_case=sc.nextInt();
		int c1900=sc.nextInt();
		int time=c1900*1900+100*(t_case-c1900);

		for(int i=0; i<c1900; i++) {
			time=time<<1;
		}
		System.out.println(time);
	}
}