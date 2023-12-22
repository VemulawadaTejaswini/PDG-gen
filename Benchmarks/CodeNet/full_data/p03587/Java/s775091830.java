import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int cnt=0;
		for(int i=0;i<6;i++)
		{
			if(s.substring(i,i+1).equals("1")){
					cnt++;
			}
		}
		System.out.println(cnt);

	}

}
