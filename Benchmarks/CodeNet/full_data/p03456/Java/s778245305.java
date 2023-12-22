		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int val = String.valueOf(b).length();
		int sum = (int) (a * Math.pow(10, val) + b);
		int r = (int)Math.sqrt((double)sum);
		if(r * r == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();