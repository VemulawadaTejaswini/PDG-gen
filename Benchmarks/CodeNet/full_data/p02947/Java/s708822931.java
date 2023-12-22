import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String[] strs = new String[num];

		for(int i=0; i<strs.length; i++) {
			strs[i] = sc.next();
		}

		int count = 0;
		for(int i=0; i<strs.length; i++) {
			for(int j=i+1; j<strs.length; j++) {
				List<String> str1Array = Arrays.asList(strs[i].split(""));
				List<String> str2Array = Arrays.asList(strs[j].split(""));
				int count2 = 0;
				for(int k=0; k<str2Array.size(); k++) {
					if(str1Array.contains(str2Array.get(k))) {
						count2++;
					}
				}
				count = count2 == str1Array.size() ? count+1 : count;
			}
		}

		System.out.println(count);
		sc.close();
	}
}
