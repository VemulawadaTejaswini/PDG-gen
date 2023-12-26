public class Main {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
           int N = sc.nextInt();
		  ArrayList<String> list = new ArrayList<String>();
		  for(int i =0;i<N;i++) {
			  String A = sc.next();
			  list.add(A);
		   }
			Map<String, Long> counts = list.stream()
				    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      System.out.println(counts.size());
    }
}
