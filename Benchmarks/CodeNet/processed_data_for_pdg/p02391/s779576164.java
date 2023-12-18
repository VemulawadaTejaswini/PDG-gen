public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		if(first > second){
			System.out.println("a > b");	
		}else if(first < second){			
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}	
	}
}
