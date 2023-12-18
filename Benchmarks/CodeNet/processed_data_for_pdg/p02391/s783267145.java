public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	if(a==b)System.out.println("a == b");
	if(a>b)System.out.println("a > b");
	else if(a<b)System.out.println("a < b");
    }
}
