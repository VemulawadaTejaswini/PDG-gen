public class Main{
    public static void main(String[]args){
	Scanner stdin = new Scanner(System.in);
	int x = stdin.nextInt();
	if(1<=x && x<=100){
	    System.out.println(x*x*x);
	}
    }
}
