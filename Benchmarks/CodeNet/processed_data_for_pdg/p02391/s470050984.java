public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		short[] ab = {sc.nextShort(),sc.nextShort()};
		if(ab[0] > ab[1]){
			System.out.println("a > b");
		}else if(ab[0] == ab[1]){
			System.out.println("a == b");
		}else{
			System.out.println("a < b");
		}
	}
}
