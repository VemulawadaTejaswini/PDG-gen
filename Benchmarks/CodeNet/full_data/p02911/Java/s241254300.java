
import java.util.HashMap;
import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		int q=scn.nextInt();
		int []arr=new int[q];
		int sum=0;
		HashMap<Integer,Integer> hmap=new HashMap<>();
		for(int i=0;i<q;i++) {
			arr[i]=scn.nextInt();
			if(hmap.containsKey(arr[i]-1)) {
				hmap.put(arr[i]-1, hmap.get(arr[i]-1)+1);
				sum++;
			}else {
				hmap.put(arr[i]-1,1);
				sum++;
			}
		}
		for(int i=0;i<n;i++) {
			if(hmap.containsKey(i)) {
			 int x=sum-hmap.get(i);
			 if(k-x>0) {
				 System.out.println("Yes");
			 }else {
				 System.out.println("No");
			 }
			}else {
				if(k-sum>0) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
	}

}
