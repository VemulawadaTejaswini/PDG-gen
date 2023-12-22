import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		String s=sc.next();
		char[] c=s.toCharArray();
		int[] l=new int[q];
		int[] r=new int[q];
		for(int i=0;i<q;i++){
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n-1;i++){
			if(c[i]=='A'&&c[i+1]=='C')
				a.add(i);
		}
				
		for(int i=0;i<q;i++){
			int count=0;
			for(Integer integer:a){
				if(l[i]-1<=integer&&integer+1<=r[i]-1)
					count++;
			}
			System.out.println(count);
		}
	}
	
}