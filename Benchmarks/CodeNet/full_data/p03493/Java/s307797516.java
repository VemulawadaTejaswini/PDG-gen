import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int cnt=0;
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
			if(a[i]==1)	cnt++;
		}
		System.out.println(cnt);

	}

}