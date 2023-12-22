
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		String answer;
		if (num1 >= num2 * 2 - 1) {
			answer = "yes";
		}else{
			answer = "no";
		}
		System.out.println(answer);