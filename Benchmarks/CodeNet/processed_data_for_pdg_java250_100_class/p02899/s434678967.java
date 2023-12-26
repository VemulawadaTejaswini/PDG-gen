public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> students = new TreeMap<Integer, Integer>();
		for(int i=1;i<=N;i++){
			students.put(sc.nextInt(),i);
		}
		for (Integer nKey : students.keySet())
        {
            System.out.println(students.get(nKey));
        }
		sc.close();
	}
};
