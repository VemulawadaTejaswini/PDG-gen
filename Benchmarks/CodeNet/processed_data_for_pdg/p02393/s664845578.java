public class Main{
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int a = stdin.nextInt();
	int b = stdin.nextInt();
	int c = stdin.nextInt();
	int ab = b-a;
	int bc = c-b;
	if(ab>0){
	    if(bc<0){
		bc = -bc;
		if(bc>ab){
		System.out.println(c+" "+a+" "+b);
		}
	        else{
		    System.out.println(a+" "+c+" "+b);
		}
	    }
	    else{
		System.out.println(a+" "+b+" "+c);
	    }
	}else{
	    ab = -ab;
	    if(bc>0){
		if(bc>ab){
		    System.out.println(b+" "+a+" "+c);
		}else{
		    System.out.println(b+" "+c+" "+a);
		}
	    }else{
		System.out.println(c+" "+b+" "+a);
	    }
	}
    }
}
