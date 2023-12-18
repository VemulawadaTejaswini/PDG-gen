class Main {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {	
            int a = sc.nextInt();	
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a < b && b < c) {			
            	System.out.println(String.format("%d %d %d",a,b,c));
            }else if(a > b && b > c){ 						
            	System.out.println(String.format("%d %d %d",c,b,a));
            }else if(a < b && b > c){
            	if(a >c) {
            	System.out.println(String.format("%d %d %d",c,a,b));
            	}else {
            		System.out.println(String.format("%d %d %d",a,c,b));
            	}
            }else if(a > b && b < c){
            	if(a >c) {
                	System.out.println(String.format("%d %d %d",b,c,a));
                	}else {
                		System.out.println(String.format("%d %d %d",b,a,c));
                	}
            }else if(a == b || b == c || a == c) {
            	if(a == b) {
            		if(c > a) {
            			System.out.println(String.format("%d %d %d",a,b,c));
            		}else {
            			System.out.println(String.format("%d %d %d",c,a,b));
            		}
            	}else if(c == b) {
            		if(c > a) {
            			System.out.println(String.format("%d %d %d",a,b,c));
            		}else {
            			System.out.println(String.format("%d %d %d",b,c,a));
            		}
            	}else if(a == c) {
            		if(b > a) {
            			System.out.println(String.format("%d %d %d",a,c,b));
            		}else {
            			System.out.println(String.format("%d %d %d",b,c,a));
            		}
            	}
            }
        }
    }
}
