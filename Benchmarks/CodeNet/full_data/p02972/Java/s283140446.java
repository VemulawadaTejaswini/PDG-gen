import java.util.*;
public class Main{
    public static void main(String sp[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		boolean b=false;
		al.add(0);
		for(int i=0;i<n;i++){
			int temp = sc.nextInt();
			al.add(temp);
			if(temp==0)
				b=true;
		}
		
		
		
		for(int i=1;i<=n;i++){
			int temp = al.get(i);
			int total=0;
			int count=0;
			StringBuilder sb = new StringBuilder();
			for(int j=i;j<=n;j+=i){
				if(al.get(j)==1){
					count++;
					sb.append(j);
				}
				total+=al.get(j);
			}
			total=total%2;
			if(temp==total){
				System.out.println(count);
				if(count>0);
				System.out.println(sb.toString());
				return;
			}
		}
		System.out.println("-1");
		
	}
}