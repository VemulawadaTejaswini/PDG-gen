import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int[] a= new int[s.length()];
		int[] check = new int[s.length()];
		for(int i=0;i<a.length;i++){
			a[i]=s.charAt(i)-'0';
			check[i]=0;
		}

		int cnt = 0;
		int l = 0;
		int r = 0;

		while(r<a.length){
			if(a[l]!=a[r]){
				check[l]=1;
				check[r]=1;
				cnt+=2;
				l=0;
				for(int x=l;x<check.length&&check[l]==1;x++)l++;
				r=l+1;
				for(int x=r;x<check.length&&check[r]==1;x++)r++;
			} else {
				l++;
				for(int x=l;x<check.length&&check[l]==1;x++)l++;
				r=l+1;
				for(int x=r;x<check.length&&check[r]==1;x++)r++;
			}
		}
		System.out.println(cnt);
	}
}