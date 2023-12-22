import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int teki = sc.nextInt();
		int waza = sc.nextInt();
      	if (teki <= waza){
        	System.out.println(0);
          	return;
        }
		List<Integer> hp = new ArrayList<Integer>();
		for (int i = 0; i < teki; i++){
			hp.add(sc.nextInt());
		}
		Collections.sort(hp, Collections.reverseOrder());
		for(int i = 0; i < waza ; i++){
			hp.remove(hp.get(0));
		}
		int ret = 0;
		for(int i = 0; i < hp.size(); i++){
			ret += hp.get(i);
		}
		
		System.out.print(ret);
	}
}