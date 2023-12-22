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
		
		Collections.sort(shake,Comparator.reverseOrder());
		Collections.sort(hurl,Comparator.reverseOrder());

		int h = 0;
		while(h<hurl.size() && shake.get(0)<hurl.get(h)){
			hp-=hurl.get(h);
			h++;
		}

		h += Math.ceil(hp/shake.get(0));

		answer(h);
	}

	private static void answer(int n){
		System.out.println(n);
		return;
	}
}