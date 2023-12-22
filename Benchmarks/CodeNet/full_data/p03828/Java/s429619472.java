import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int target = cin.nextInt();
		cin.close();
		long count = 0;
		long div = (long)Math.pow(10,9)+7;
		int tmp;
		HashMap<Integer,Integer> dnum = new HashMap<Integer,Integer>();
		for(int i=1;i<target;i++){
			tmp = i;
			for(int j=2;j*j<=tmp;j++){
				if(tmp%j==0){
					if(dnum.containsKey(j)){
						dnum.put(j, dnum.get(j)+1);
					}else{
						dnum.put(j, 1);
					}
					tmp = tmp/j;
					j=2;
				}
			}
			if(tmp>1){
				if(dnum.containsKey(tmp)){
					dnum.put(tmp, dnum.get(tmp)+1);
				}else{
					dnum.put(tmp, 1);
				}
			}
		}

		for(int key:dnum.keySet()){

			if(key>1){
				count *= dnum.get(key)+1;
			}

		}

		System.out.println(count%div);
	}
}
