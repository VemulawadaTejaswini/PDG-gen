class Main {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int p;
        if(b<a){
        p=a;
        a=b;
        b=p;
        }
        if(c<b){
        p=b;
        b=c;
        c=p;
        }
        if(b<a){
        p=a;
        a=b;
        b=p;
     	}
        System.out.println(a+" "+b+" "+c);
}
}
