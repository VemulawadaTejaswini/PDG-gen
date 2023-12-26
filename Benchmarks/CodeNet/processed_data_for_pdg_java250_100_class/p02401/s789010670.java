public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int answer = 0;
			int num1 = sc.nextInt();
			String computing = sc.next();
			int num2 = sc.nextInt();
			if(computing.equals("?")){
				break;
			}
			if(computing.equals("+")){
				answer = num1 + num2;
				System.out.println(answer);
			}else if(computing.equals("-")){
				answer = num1 - num2;
				System.out.println(answer);
			}else if(computing.equals("*")){
				answer = num1 * num2;
				System.out.println(answer);
			}else if(computing.equals("/")){
				answer = num1 / num2;
				System.out.println(answer);
			}
		}
	}
}
