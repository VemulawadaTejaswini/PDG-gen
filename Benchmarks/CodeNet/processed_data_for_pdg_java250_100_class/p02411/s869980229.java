public class Main {
	public static void main(String[] args) {
		int[] NumList = new int[3];
		int Result = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String line = br.readLine();
				if (line != null) {
					String[] InputList = line.split(" ", 0);
					for (int i = 0; i < InputList.length; i++) {
						NumList[i] = Integer.parseInt(InputList[i]);
					}
					if(!Arrays.asList(NumList[0]).contains(-1) || !Arrays.asList(NumList[1]).contains(-1)){
						if (!Arrays.asList(NumList[0]).contains(-1) && !Arrays.asList(NumList[1]).contains(-1)) {
							if(Result >= 80){
								System.out.println("A");
							}
							else if (Result >= 65) {
								System.out.println("B");
							}
							else if (Result >= 50) {
								System.out.println("C");
							}
							else if (Result >= 30) {
								if (NumList[2] >= 50) {
									System.out.println("C");
								}else {
									System.out.println("D");
								}
							}
							else {
								System.out.println("F");
							}
						}
						else{
							System.out.println("F");
						}
					}else{
						break;
					}
				}else {
					break;
				}
			}
		}catch (NumberFormatException e) {
			System.out.println(e);
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
