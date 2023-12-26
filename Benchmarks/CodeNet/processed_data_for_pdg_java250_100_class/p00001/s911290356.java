public class Main {
	public static void main(String[] args) throws IOException {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(3, Collections.reverseOrder());
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    while ((s = in.readLine()) != null && s.length() != 0) {
	    	pq.add(Integer.parseInt(s));
	    }
	    for (int i = 0; i < 3; i++) {
			System.out.println(pq.poll());
		}
	}
}
