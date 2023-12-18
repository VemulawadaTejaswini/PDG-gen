public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		Integer n;
		while(true){
			n = sc.nextInt();
			if(n.intValue() == 0){
				break;
			}
			list.add(n);
		}
		for(int i = 0;i < list.size(); i++){
			System.out.printf("Case %d: %d\n", i + 1, list.get(i).intValue());
		}
	}
}
