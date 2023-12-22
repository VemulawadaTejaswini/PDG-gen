import java.util.*;
public class Main {
	

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] scores = new int[n];
		
		List<String> nameList = new ArrayList<>();
		Set<String> nameSet = new TreeSet<>();
		
		Map<String, Integer> dic = new HashMap<>();
		
		
		for(int i=0;i<n;i++) {
			names[i] = sc.next();
			scores[i] = sc.nextInt();
			
			nameSet.add(names[i]);
			dic.put(names[i] + scores[i],i );
			
		}
		
		for(Iterator<String> userIter = nameSet.iterator(); userIter.hasNext();) {
			String name = userIter.next();
			
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<n;i++) {
				if(names[i].equals(name)) {
					
					list.add(scores[i]);
				}
				
			}
			Collections.sort(list);
			Collections.reverse(list);
			
			for(Integer i: list) {
				System.out.println(dic.get(name+i) + 1);
			}
			
			
		}
		
		
		

		
		
	}
	

}