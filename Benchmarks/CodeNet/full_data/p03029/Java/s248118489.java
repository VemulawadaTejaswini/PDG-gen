public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] split = line.split(" ");
        
        System.out.println(calculate(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
	}
	
	public static int calculate(int apples, int pieces) {
		
		
		return (apples*3 + pieces)/2;
	}
}
