public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	while(true){
	    c -= b;
	    if(c<=0) break;
	    a -= d;
	    if(a<=0) break;
	}
	if(c<=0) System.out.print("Yes");
	else if(a<=0) System.out.print("No");
    }
}
