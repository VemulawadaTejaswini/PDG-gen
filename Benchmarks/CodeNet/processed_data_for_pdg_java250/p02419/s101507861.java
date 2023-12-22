public class Main{
	public static void main(String[] args) {
		int intAnwer = 0;
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			String strLine = insBR.readLine();
			strLine = strLine.toLowerCase();
			char[] chaAryLine1 = strLine.toCharArray();
			while (true) {
				strLine = insBR.readLine();
				if (strLine.equals("END_OF_TEXT")) {
					break;
				}
				strLine = strLine.toLowerCase();
				char[] chaAryLineAll = strLine.toCharArray();
				int intCount = 0;
				int intlength = chaAryLineAll.length - chaAryLine1.length + 1;
				for (int i = 0; i < intlength; i++) {
					char a = chaAryLine1[0];
					char b = chaAryLineAll[i];
					if (a == b) {
						for (int j = 1; j < chaAryLine1.length; j++) {
							a = chaAryLine1[j];
							b = chaAryLineAll[i + j];
							if (a == b) {
								intCount++;
								if (intCount == chaAryLine1.length - 1) {
									if(i == 0 && i + j + 1 != chaAryLineAll.length) {
										if(chaAryLineAll[i + j + 1] == ' ') {
											intAnwer++;
										}
									}else if(0 < i && i + j + 1 == chaAryLineAll.length) {
										if(chaAryLineAll[i -1] == ' ') {
											intAnwer++;
										}
									}else if(0 < i && i + j + 1 < chaAryLineAll.length) {
										if(chaAryLineAll[i -1] == ' ') {
											if(chaAryLineAll[i + j + 1] == ' ') {
												intAnwer++;
											}
										}
									}else if(i == 0 && i + j + 1 == chaAryLineAll.length) {
										intAnwer++;
									}
								}
							}
						}
					}
					if(chaAryLine1.length == 1) {
						if(a == b) {
							if(i == 0 && i + 1 != chaAryLineAll.length) {
								if(chaAryLineAll[i + 1] == ' ') {
									intAnwer++;
								}
							}else if(0 < i && i + 1 == chaAryLineAll.length) {
								if(chaAryLineAll[i -1] == ' ') {
									intAnwer++;
								}
							}else if(0 < i && i + 1 < chaAryLineAll.length) {
								if(chaAryLineAll[i -1] == ' ') {
									if(chaAryLineAll[i + 1] == ' ') {
										intAnwer++;
									}
								}
							}else if(i == 0 && i + 1 == chaAryLineAll.length) {
								intAnwer++;
							}
						}
					}
					intCount = 0;
				}
			}
			System.out.println(intAnwer);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
