public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		String s = "";
		for(int i=0; i <n; i++){
			s = scan.next();
			if( ! hmap.containsKey(s)){
				hmap.put(s, 1);
			}
		}
		System.out.println(hmap.size());
	}
}
