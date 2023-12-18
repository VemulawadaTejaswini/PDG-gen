public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b){
        	d=a;
        	a=b;
        	b=d;
        }
        if(b>c){
        	d=b;
        	b=c;
        	c=d;
        }
        if(a>b){
        	d=a;
        	a=b;
        	b=d;
        }
        System.out.println(a+" "+b+" "+c);
        sc.close();
        }
}
