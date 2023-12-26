public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		String[] arr = scanner.nextLine().split(" ");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
			if(i!=0){System.out.print(" ");}else{System.out.println();}
		}
	}
}
