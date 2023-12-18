	class Main{
		public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            int a,b,c,d;
            int i;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
				if(a>b){
                    d=a;
                    a=b;
                    b=d;
                }
           		if(a>c){
                    d=a;
                    a=c;
                    c=d;
                }
                if(b>c){
                    d=b;
                    b=c;
                    c=d;
                }
         	System.out.println(a+" "+b+" "+c);
        }
    }
