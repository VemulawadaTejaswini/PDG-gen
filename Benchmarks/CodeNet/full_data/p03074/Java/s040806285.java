import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		String str=scn.next();
		ArrayList<Integer> al=new ArrayList<>();
		int cnt=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				cnt++;
			}else {
				al.add(cnt);
				cnt=1;
			}
		}
		al.add(cnt);
		long []sum=new long[al.size()];
		for(int j=0;j<al.size();j++) {
			if(j>0) {
				sum[j]+=sum[j-1]+al.get(j);
			}else {
				sum[j]=al.get(j);
			}
		}
//		System.out.println(al.size());
//		for(int i=0;i<al.size();i++) {
//			System.out.print(al.get(i)+" ");
//		}
//		System.out.println();
		n=al.size()/2;
		if(str.charAt(0)=='0'&&al.size()%2!=0)
			n++;
      int start=0;
      if(str.charAt(0)=='1') start=1;
		if(k>=n) {
			System.out.println(sum[al.size()-1]);
		}
      else {
			long max=sum[start+(k-1)*2+1<al.size()?1+(k-1)*2+1:1+(k-1)*2];
			for(int j=start+2;j<al.size();j+=2) {
              int r = j+(k-1)*2+1;
              if(r>=al.size()) r=al.size()-1;
				if(sum[r]-sum[j-2]>max) {
					max=sum[r]-sum[j-2];
				}
			}
			System.out.println(max);
		}
	}

}
