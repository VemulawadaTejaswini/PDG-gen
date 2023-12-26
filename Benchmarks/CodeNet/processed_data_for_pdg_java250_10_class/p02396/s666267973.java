public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> caseNum = new ArrayList<Integer>();
		int num;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			num=sc.nextInt();
			if(num==0){
				break;
			}
			caseNum.add(num);
		}
		for (int i = 0; i < caseNum.size(); i++) {
			System.out.println("Case "+(i+1)+": "+caseNum.get(i).intValue());
		}
	}
}
