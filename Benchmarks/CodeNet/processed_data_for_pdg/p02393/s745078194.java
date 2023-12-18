class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        	int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            while(!(a <= b && b <= c)){ 
            	if(a > b) {
            		a = a ^ b;
            		b = a ^ b;
            		a = a ^ b; 
            	}
            	if(b > c) {
            		b = b ^ c;
            		c = b ^ c;
            		b = b ^ c; 
            	}
            }
            System.out.println(String.format("%d %d %d", a, b, c));
        }
    }
}
