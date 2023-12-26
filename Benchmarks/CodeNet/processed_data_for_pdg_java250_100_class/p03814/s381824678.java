public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] splitS = s.split("");
		int positionA = 0;
		for(int i = 0;i < splitS.length;i++) {
			if(splitS[i].equals("A")) {
				positionA = i;
				break;
			}
		}
		int positionZ = 0;
		for(int i = positionA;i < splitS.length;i++) {
			if(splitS[i].equals("Z")) {
				positionZ = i;
			}
		}
			System.out.println(positionZ-positionA+1);
	}
}
