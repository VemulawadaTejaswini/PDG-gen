public class Main {
	public static void main(String[] args){
		String input = new java.util.Scanner ( System.in ).nextLine();
		String[] inputArray = input.split(" ");
		int x = Integer.parseInt(inputArray[0]);
		int y = Integer.parseInt(inputArray[1]);
		int z = x+x+y+y;
		System.out.println(x*y + " " + z);
	}
}
