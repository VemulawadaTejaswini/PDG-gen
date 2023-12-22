public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String arr[] = s.nextLine().split(" ");
		ArrayList<Integer> arrr = new ArrayList<Integer>();
		for(String str : arr){
			arrr.add(Integer.parseInt(str));
		}

		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		if((a+b) == c){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
		System.out.println("");
	}
}