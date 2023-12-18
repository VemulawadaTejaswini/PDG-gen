public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" "); 
		System.out.print(Integer.parseInt(array[0])*Integer.parseInt(array[1]) +" ");
		System.out.println(Integer.parseInt(array[0])*2+Integer.parseInt(array[1])*2);
	}
}
