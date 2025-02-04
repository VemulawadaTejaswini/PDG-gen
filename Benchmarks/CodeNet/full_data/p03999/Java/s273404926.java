import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		long sum = 0;
		ArrayList<Long> list = new ArrayList<Long>();

		for(int i=0;i<Math.pow(2, s.length()-1);i++){
			String bit = Integer.toBinaryString(i);
			while(bit.length() < s.length()-1){
				bit = 0 + bit;
			}
			//System.out.println(bit);
			int count = 0;
			int pos = 0;
			list.clear();
			for(int j=0;j<bit.length();j++){
				if(bit.charAt(j) == '1'){
					list.add(Long.parseLong(s.substring(pos,j+1)));
					count++;
					pos = j+1;
				}
			}
			if(count == 0){
				list.add(Long.parseLong(s,10));
			}else{
				list.add(Long.parseLong(s.substring(pos,s.length())));
			}
			for(int j=0;j<list.size();j++){
				//System.out.println(list.get(j));
				sum += list.get(j);
			}
		}
		System.out.println(sum);
	}

}
