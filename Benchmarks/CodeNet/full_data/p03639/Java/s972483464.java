import java.util.*;
class B{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		int a=0;
		int cnt=0;
		int cnt4=0;
		int cnt2=0;
		do{
			a=sn.nextInt();
			if(a%4==0)
				cnt4++;
			else if(a%2==0)
				cnt2++;
			cnt++;
	}while(cnt<n);
	cnt4+=cnt2/2;
		if(cnt4>=n/2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}