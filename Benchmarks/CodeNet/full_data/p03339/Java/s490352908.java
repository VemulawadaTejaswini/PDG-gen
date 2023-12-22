import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String s = sc.nextLine();
		
		int min = Integer.parseInt(n);
		List<String> members = Arrays.asList(s.split(""));
		
		for(int i=0; i< members.size(); i++) {
			int tmp = 0;
			
			for(int j=0; j<members.size(); j++) {
				if(j != i) {
					if(j < i) {
						if(members.get(j).equals("W")) {
							tmp++;
						}
					}
					else if(j > i) {
						if(members.get(j).equals("E")) {
							tmp++;
						}
					}
				}
					
			}
			if(min > tmp)
				min = tmp;
		}
		
		System.out.println(min);
	}
		
}
