
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		int num1 = Integer.parseInt(num);
		num = br.readLine();
		int num2 = Integer.parseInt(num);
		num1=num1*num1;
		num1=num1-num2;
		System.out.println(num1);


}