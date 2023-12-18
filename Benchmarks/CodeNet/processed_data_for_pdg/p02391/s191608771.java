public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int intA = sc.nextInt();
		int intB = sc.nextInt();
		if(intA < intB){
			System.out.println("a < b");
		}else if(intA > intB){
			System.out.println("a > b");
		}else{
			System.out.println("a == b");
		}
	}
}
