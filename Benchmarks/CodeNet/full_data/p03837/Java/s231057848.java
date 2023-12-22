import java.util.*;
class pair{
	int dis;
	int x1;
	
pair(int c){
	dis=c;
}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int m=sc.nextInt();
		
		ArrayList<ArrayList<pair>> g=new ArrayList<>();
		for(int i=0;i<n;i++) {
			g.add(new ArrayList<>());
		}
		ArrayList<Integer> al=new ArrayList<>();
		int res=0;
		for(int i=0;i<m;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int c=sc.nextInt();
		
			al.add(c);
			
			
		}
		Collections.sort(al);
		for(int i:al) {
		if(i>al.get(0)) {
			res++;
		}
}
		System.out.println(res);
		
		
	}

}
