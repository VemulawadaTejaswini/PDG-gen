public class Main{
    public static void main(String[] args){
	Scanner kbd = new Scanner(System.in);
	int n = kbd.nextInt();
	int m = kbd.nextInt();
	int s = n*m;
	int t = (n+m)*2;
	System.out.println(s+" "+t);
    }
}
