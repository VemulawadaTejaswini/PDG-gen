public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String f = sc.next();
		if(a % 2 == 0){
			if(f.substring(0,a / 2).equals(f.substring(a / 2,a))){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
		}
	}
}
