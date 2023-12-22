import java.util.*;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int hp = sc.nextInt();

		ArrayList<Integer> shake = new ArrayList<>();
		ArrayList<Integer> hurl = new ArrayList<>();

		for(int n=0;n<num;n++){
			shake.add(sc.nextInt());
			hurl.add(sc.nextInt());
		}
		
		int count = 0;
		
		while(hp>=0){
			int hnum = max(hurl);
			int snum = max(shake);
			if(hnum != snum){
				hp -= hurl.get(hnum);
				shake.remove(hnum);
				hurl.remove(hnum);
			}
			if(hurl.get(hnum)<shake.get(snum)) break;
		}

		if(hp>0)
		count += (int)Math.ceil(hp/shake.get(0));

		answer(count);
	}

	private static void answer(int n){
		System.out.println(n);
		return;
	}

	private static int max(ArrayList<Integer> arr){
		int tmp=arr.get(0);
		int num=0;
		for(int n=1;n<arr.size();n++){
			if(tmp<arr.get(n)){
				tmp = arr.get(n);
				num = n;
			}
		}

		return num;
	} 
}