public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
		boolean result = true;
      if (a == b && a == c) {
        result = false; 
      } else if (a == b && a != c) {
        result = true; 
      } else if (a != b && b == c) {
        result = true; 
      } else if (a != b && b != c && a != c) {
        result = false; 
      } else if (a == c && a != b) {
        result = true; 
      }
		System.out.println(result? "Yes": "No");
	}
}
