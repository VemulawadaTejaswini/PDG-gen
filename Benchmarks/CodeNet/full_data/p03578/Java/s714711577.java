import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			int buf=sc.nextInt();
			if(hs.containsKey(buf)){
				hs.put(buf, hs.get(buf)+1);
			}
			else{
				hs.put(buf, 1);
			}
		}
		boolean is=true;
		int m=sc.nextInt();
		int[] t=new int[m];
		for(int i=0;i<m;i++){
			int buf=sc.nextInt();
			if(hs.containsKey(buf)){
				int b=hs.get(buf);
				if(b==1){
					hs.remove(buf);
				}else{
					hs.put(buf, b-1);
				}
			}
			else{
				is=false;
			}
		}

		if(is){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}