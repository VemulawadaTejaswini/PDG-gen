public class Main{
	public static void main(String[] args){
		Scanner sc = null;
		ArrayList<Integer> array = new ArrayList<Integer>();
		int number = 0;
		sc = new Scanner(System.in);
		do{
			number = sc.nextInt();
			array.add(number);
		}while(number != 0);
		for(int i =1;i < array.size();i++){
			System.out.println("Case "+i+": "+array.get(i-1));
		}
	}
}
