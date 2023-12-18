 class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(),x;
		if(a > b){
			x = a;
			a = b;
			b = x;
		}
		if(a > c){
			x = a;
			a = c;
			c = x;
		}
		if(b > c){
			x = b;
			b = c;
			c = x;
		}
		System.out.println(a+" "+b+" "+c);
	}
 }
