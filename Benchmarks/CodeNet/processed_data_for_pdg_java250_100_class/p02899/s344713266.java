public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer>attendanceNumber=new HashMap<>();
		int N=sc.nextInt();
		for(int i=1;i<=N;i++) {
			attendanceNumber.put(sc.nextInt(),i);
		}
		for(int i=1;i<=N;i++) {
			if(attendanceNumber.containsKey(i)) {
				System.out.print(attendanceNumber.get(i)+" ");
			}
		}
	}
}
