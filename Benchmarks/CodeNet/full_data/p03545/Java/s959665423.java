import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		int c=1000;
		while(c>0) {
			if(n>=c) {
			    list.add(n/c);
			}else {
				list.add(0);
			}
			n%=c;
			c/=10;
		}


		for(int i=0;i<=7;i++) {
			String s=Integer.toBinaryString(i);

			int a=Integer.valueOf(s);
			String b=String.format("%03d",a);
			;
			char[] e=b.toCharArray();
			int k=keisan(list,e);
			if(k==7) {
				e[0]=(e[0]=='1')?'+':'-';
				e[1]=(e[1]=='1')?'+':'-';
				e[2]=(e[2]=='1')?'+':'-';
				for(int j=0;j<3;j++) {
					System.out.print(list.get(j));
					System.out.print(e[j]);
				}
				System.out.print(list.get(3)+"=7");
				break;
			}


		}



	}

	public static int keisan(List<Integer> list,char[] e) {
		int k=list.get(0);
		if(e[0]=='1') {
			k+=list.get(1);
		}else {
			k-=list.get(1);
		}
		if(e[1]=='1') {
			k+=list.get(2);
		}else {
			k-=list.get(2);
		}
		if(e[2]=='1') {
			k+=list.get(3);
		}else {
			k-=list.get(3);
		}
		return k;

	}



}
