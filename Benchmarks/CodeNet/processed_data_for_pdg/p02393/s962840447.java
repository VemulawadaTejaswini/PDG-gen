public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int i;
        if(a>b){
        	i=a;a=b;b=i;
        }
        if(b>c){
        	i=b;b=c;c=i;
        }
        if(a>b){
        	i=a;a=b;b=i;
        }
        System.out.println(a+" "+b+" "+c );
	}
}
