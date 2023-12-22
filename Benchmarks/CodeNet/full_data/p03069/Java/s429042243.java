		int numN = nextInt();
		String sS = next();
		char[] tmp = new char[numN];
		char[] tmp2 = new char[numN];

		for (int i = 0; i < numN; i++) {
			tmp[i] = sS.charAt(i);
			tmp2[i] = sS.charAt(i);
		}
		int res = 0;
		for (int i = 1; i < numN; i++) {
			if (tmp[i] == '.' && tmp[i - 1] == '#') {
				res++;
				tmp[i] = '#';
			}
		}

		int res2 = 0;
		for (int i = 1; i < numN; i++) {
			if (tmp2[i] == '.' && tmp2[i - 1] == '#') {
				res2++;
				tmp2[i - 1] = '.';
			}
		}

		out.println(Integer.min(res, res2));