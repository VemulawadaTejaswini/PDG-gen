public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	ArrayList<String> result = new ArrayList<>();
    	result.add(sc.next());
    	for(int i=1;i<N;i++) {
    		result.add(sc.next());
    	}
		Collections.sort(result);
		ArrayList<String> ans = new ArrayList<String>(new HashSet<>(result));
    	System.out.println(ans.size());
    }
}
