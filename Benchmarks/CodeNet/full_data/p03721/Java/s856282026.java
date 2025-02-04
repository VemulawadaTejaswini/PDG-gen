import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num.add(sc.nextInt());
			} else {
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();
		int count = 0;

		for(int i = 2; i < num.size(); i+=2){
			if(list.containsKey(num.get(i))){
				list.put(num.get(i),list.get(num.get(i)) + num.get(i+1));
			}else{
				list.put(num.get(i),num.get(i+1));
			}
		}
		Object[] mapkey = list.keySet().toArray();
        Arrays.sort(mapkey);

        for (Object nKey : mapkey)
        {
        	if(num.get(1) - list.get(nKey) <= 0){
        		System.out.println(nKey);
        		System.exit(0);
        	}else{
        		num.set(1,num.get(1) - list.get(nKey));
        	}
        	count++;
        }
	}
}