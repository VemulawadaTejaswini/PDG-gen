public class Main{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a-b;
	if(c>0){ System.out.println( "a > b" ); }
	if(c<0){ System.out.println( "a < b" ); }
	if(c==0){ System.out.println( "a == b" ); }
    }
}
