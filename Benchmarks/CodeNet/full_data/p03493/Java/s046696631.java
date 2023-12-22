Scanner sc = new Scanner(System.in);

		String s = sc.next();
		System.out.println(s.replaceAll("0", "").length());