public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
  		int a = s.nextInt();
    	int b = s.nextInt();
   		int c = s.nextInt();
		System.out.println(a+b+c >= 22 ? "bust" : "win");
	}
}