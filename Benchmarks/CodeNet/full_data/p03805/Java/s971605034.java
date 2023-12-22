
import java.util.ArrayList;
import java.util.Scanner;

class Main{
	static int ans=0;
	static ArrayList<Integer> list;
	static ArrayList<ArrayList<Integer>> llist=new ArrayList<ArrayList<Integer>>();
	static int n,m;
	static boolean buf;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();m=sc.nextInt();
		for(int i=0;i<n+1;i++){
			list=new ArrayList<Integer>();
			llist.add(list);
		}
		for(int i=0;i<m;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			llist.get(a).add(b);
			llist.get(b).add(a);
		}
		boolean[] check=new boolean[n+1];
		int cnt=1;
		buf=search(cnt,check,1);
		System.out.println(ans);
	}

	static boolean search(int cnt,boolean[] check,int ind){
		ArrayList<Integer> list=llist.get(ind);
		check[ind]=true;
		int cntclone=cnt;
		boolean[] checklone=check.clone();
		if(cntclone==n){
			ans++;
//	System.out.println("ans++");
			return true;
		}

		for(int i=0;i<list.size();i++){
			int next=list.get(i);
/*	System.out.println("Now="+ind);
			System.out.println("i="+i+" listsize="+list.size());
			for(int z=1;z<n+1;z++){
				System.out.print(z+"="+checklone[z]+" ");
			}
			System.out.println();*/
			if(!checklone[next]){
//		System.out.println("TO "+next);
				buf=search(++cnt,check,next);
/*		System.out.println("Now="+ind);
				System.out.println(i+" "+list.size());
				for(int z=1;z<n+1;z++){
					System.out.print(z+"="+checklone[z]+" ");
				}
						System.out.println();*/

			}else{
		//		System.out.println("NotTO "+next);
			}

		}
		return true;
	}

}