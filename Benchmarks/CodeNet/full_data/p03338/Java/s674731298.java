import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		String str = null;
		Scanner sc = new Scanner(System.in);
		int index = 0;
		boolean flg = false;
		int max = 0;
		int cnt = 0;
		n = sc.nextInt();
		str = sc.next();


		List<String> strList = new ArrayList<String>();
		
		for(int i = 0; i < str.length(); i++){
			flg = true;
			for(int j =0; j < strList.size(); j ++){
				if(str.substring(i,i+1).equals(strList.get(j)))
					flg = false;
					index = i;
			}
			
			if(flg)
				strList.add(str.substring(index, index + 1));
		}
		
		int list[] = new int[strList.size()];
		
		for(int i = 0; i < str.length(); i++){
			for(int j =0; j < strList.size(); j ++){
				if(str.substring(i,i+1).equals(strList.get(j)))
					list[j]++;
				
			}
		}
		
		for(int i =0; i < list.length; i++)
			if(max < list[i])
				max = list[i];
		
		
	
		for(int i = 0; i < strList.size(); i++)
			if(list[i] == max)
				cnt++;
			
		
		System.out.println(cnt);
	}
}
