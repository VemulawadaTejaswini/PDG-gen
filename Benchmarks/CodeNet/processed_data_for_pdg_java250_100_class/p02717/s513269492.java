public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	int c=sc.nextInt();
    	int temp1=b;
    	b=a;
    	a=temp1;
    	int temp=c;
    	c=a;
    	a=temp;
    	System.out.print(a+" "+b+" "+c);
     }
}
