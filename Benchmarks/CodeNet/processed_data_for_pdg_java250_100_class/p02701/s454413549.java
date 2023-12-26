public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        List<String> listA = new ArrayList<String>(N);
		for (int i=0; i<N; i++) {
          listA.add(sc.next());
        }
        List<String> listB = new ArrayList<String>(new HashSet<>(listA));
        System.out.println(listB.size());
	}
}
