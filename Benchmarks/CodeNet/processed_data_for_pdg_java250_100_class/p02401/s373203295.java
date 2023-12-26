class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
		    String s1 = sc.next();
		    int a = Integer.parseInt(s1);
		    String sop = sc.next();
		    char op = sop.charAt(0);
		    String s2 = sc.next(); 
		    int b = Integer.parseInt(s2);
		    if(op == '?'){
		    	break;
		    }
		    if(0 <= a && a <= 20000){
		    	if(0 <= b && b <= 20000){
		    		if(op == '+'){
		    			System.out.println(a + b);
		    		}
		    		else if(op == '-'){
		    			System.out.println(a - b);
		    		}
		    		else if(op == '*'){
		    			System.out.println(a * b);
		    		}
		    		else if(op == '/'){
		    			System.out.println(a / b);
		    		}
		    	}
		    }
		}
	}
}
