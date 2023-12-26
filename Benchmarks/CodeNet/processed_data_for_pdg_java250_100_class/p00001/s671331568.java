public class Main{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<10; i++){
			list.add(scan.nextInt());
		}
		Collections.sort(list);
		Collections.reverse(list);
		for(int i=0; i<3; i++){
			System.out.println(list.get(i));
		}
	}
}
