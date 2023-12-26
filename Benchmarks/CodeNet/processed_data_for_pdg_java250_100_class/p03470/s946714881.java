public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			if(!numList.contains(value)){
				numList.add(value);
			}
		}
		System.out.println(numList.size());
	}
}
