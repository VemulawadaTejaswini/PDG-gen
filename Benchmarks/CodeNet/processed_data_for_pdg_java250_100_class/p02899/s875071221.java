public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int student = sc.nextInt();
		int[] school = new int[student];
		int[] memory = new int[student];
		for(int i = 0;i<student; i++) {
			school[i] = sc.nextInt();
		}
		for(int i=0 ; i<student; i++) {
			memory[school[i]-1] = i+1;
		}
		for(int i= 0; i<memory.length; i++) {
			System.out.println(memory[i] + " ");
		}
	}
}
