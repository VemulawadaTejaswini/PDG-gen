public class Main {
	public static void main(String[] atgs){
		Scanner sc = new Scanner(System.in);
		while(true){
			int A = sc.nextInt();
			String operator = sc.next();
			int B = sc.nextInt();
			if(operator.equals("?")){
			 break;
			}
			switch(operator){
			case "+":
				System.out.println(A + B);
				break;
			case "-":
				System.out.println(A - B);
				break;
			case"*":
				System.out.println(A * B);
				break;
			case"/":
				System.out.println(A / B);
				break;
			default:
				break;
				}
		}
	}
}
