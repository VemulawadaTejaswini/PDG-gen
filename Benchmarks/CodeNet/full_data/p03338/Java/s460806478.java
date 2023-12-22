import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numOfChar = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		int sysoutResult = 0;
		for(int i = 0; i < numOfChar; i++){
			String str0 = str.substring(0,i);
			String str1 = str.substring(i,numOfChar);
			System.out.println(str0 + " " + str1);
			String[] inputStr = str0.split("");
			int count = 0;
			Set<String> set = new HashSet<>();
			for(int ii = 0; ii < i; ii++){
				set.add(inputStr[ii]);
			}
			Iterator<String> it = set.iterator();
			for(int ii = 0; ii < i; ii++){
				while(it.hasNext()){
					int result = str1.indexOf(it.next());
					if(result != -1){
						count = count + 1;
					}
				}
			}
			if(count > sysoutResult){
				sysoutResult = count;
			}
		}
		System.out.println(sysoutResult);
	}
}