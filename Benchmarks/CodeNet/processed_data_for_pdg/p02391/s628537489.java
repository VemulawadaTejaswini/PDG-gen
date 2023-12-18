class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String st = scan.next();
	int a = Integer.parseInt(st);
	st = scan.next();
	int b = Integer.parseInt(st);
	if(a > b)
	    {System.out.println("a > b");
	    }
	else if(a < b)
	    {System.out.println("a < b");
	    }
	else System.out.println("a == b");
    }
}
