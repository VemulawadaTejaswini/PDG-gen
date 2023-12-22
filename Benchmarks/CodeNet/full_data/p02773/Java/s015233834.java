import java.util.*;
class Main{
	public static void main(String ags[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] count = new int[n];
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++){
			s[i] = sc.next();
			list.add(s[i]);
		}
			
		Set<String> set = new HashSet<>(list);
		//~ System.out.println(list);
		for (int i = 0; i < n; i++){	
			if (set.contains(s[i])){
				count[list.indexOf(s[i])]++;
				//~ System.out.println( " " + count[i] + " c " );
			} 
		}
		List<String> sortedList = new ArrayList<>(); 
		//~ System.out.println( set_to_string + " " + Arrays.toString(count));
		int max = Arrays.stream(count).max().getAsInt();
		for (int i = 0; i < n; i++){
			if (count[i] == max){
				sortedList.add(s[i]);
			}
		}
		Collections.sort(sortedList);
		for (int i = 0; i < sortedList.size(); i++)
			System.out.println(sortedList.get(i));
	}
}
