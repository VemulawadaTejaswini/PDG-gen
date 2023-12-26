public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String result = "Yes";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++){
		    hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
		}
		for(Integer i : hm.values()){
		    if(i != 2) result = "No";
		}
		System.out.println(result);
	}
}
