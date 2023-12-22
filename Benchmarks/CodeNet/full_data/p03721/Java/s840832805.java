import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int[] h=new int[n];
		int ite=0;
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			int buf=sc.nextInt();
			if(hm.containsKey(h[i])){
				hm.put(h[i], hm.get(h[i])+buf);
			}else{
				h[ite++]=a;
				hm.put(h[i], buf);
			}
		}
		Arrays.sort(h);
		ite=0;
		while(k>0){
			k-=hm.get(h[ite]);
			ite++;
		}
		System.out.println(h[--ite]);
	}
}