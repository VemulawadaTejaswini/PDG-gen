public class Main {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
	String s = "";
	if (a > b)
		s = "a > b";
	else if (a < b)
		s = "a < b";
	else
		s = "a == b";
        System.out.printf("%s%n", s);
    }   
}
