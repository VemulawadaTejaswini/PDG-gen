public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			numList.add(sc.nextInt());
		}
		Collections.sort(numList, Collections.reverseOrder());
		int alice = 0;
		int bob = 0;
		for(int i = 0; i < n; i++){
			int point = numList.get(i);
			if(i%2 == 0){
				alice = alice + point; 
			}else{
				bob = bob + point; 
			}
		}
		System.out.println(alice - bob);
	}
}
