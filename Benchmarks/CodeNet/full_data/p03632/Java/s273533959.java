Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int x = 0,y = 0;
		if(a > c) {
			y = a;
			a = c;
			c = y;
			y = b;
			b = d;
			y = d;
		}
		if(b < c) {
			System.out.println(x);
		}else if(b < d ){
			x = (b - c);
			System.out.println(x);
		}else if(b >= d && a < c) {
			x = (d - c);
			System.out.println(x);
		}
	}
}

