public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int legs = sc.nextInt();
		int turtles = (legs/2) - n;
		int cranes = Math.abs(n-turtles);
		if(turtles>=0 && cranes >=0 && turtles+cranes==n && ((2*cranes)+(4*turtles)) == legs ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
