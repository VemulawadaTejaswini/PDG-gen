public class Main {
	public static void main(String[] args) {
		int addTrue;
		int Number;
		int Count = 0;
		int[] NumList = new int[2];
		String[] InputList;
		Scanner sc = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String line = br.readLine();
				if (line != null) {
					InputList = line.split(" ", 0);
					for (int i = 0; i < InputList.length; i++) {
						NumList[i] = Integer.parseInt(InputList[i]);
					}
					Number = NumList[0];
					addTrue = NumList[1];
					if (Number != 0 || addTrue != 0) {
						Count = 0;
						for (int i = 1; i <= Number; i++) {
							for (int j = i + 1; j <= Number; j++) {
								for (int k = j + 1; k <= Number; k++) {
									if ((i + j + k) == addTrue) {
										Count++;
									}
								}
							}
						}
						System.out.println(Count);
					}else{
						break;
					}
				}else{
					break;
				}
			}
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
