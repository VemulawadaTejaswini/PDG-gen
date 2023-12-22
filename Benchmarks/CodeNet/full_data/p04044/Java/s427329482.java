import java.util.*;

public class Main {


	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int l = Integer.parseInt(line[1]);
		
		List<String> list = new ArrayList<String>();
		String input = null;

		String min = null;
		
		for(int i=0;i<n;i++){
			list.add(sc.nextLine());
		}
		
		List<String> combList = comb(list);
		
		min = combList.get(0);
		for(int i=0;i<combList.size()-1;i++){
			if(combList.get(i).compareTo(combList.get(i+1))>0){
				min = combList.get(i+1);
			}
		}
		System.out.println(min);
	}
	
	private static List<String> comb(List<String> list){
		List<String> combList = new ArrayList<String>();
		eachComb(list,"",combList);
		return combList;
	}
	
	private static void eachComb(List<String> list,String result,List<String> combList){
		
		if(list.size() <= 0){
			combList.add(result);
		}else {
			for(int i=0;i<list.size();i++){
				List<String> unusedList = new ArrayList<String>(list);
				String incResult = result + unusedList.get(i);
				unusedList.remove(i);
				eachComb(unusedList,incResult,combList);
			}
		}
	}
}