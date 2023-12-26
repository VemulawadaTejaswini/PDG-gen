public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> heightsOfMountain = new ArrayList<Integer>();
		String line = null;
		while ((line = br.readLine()) != null) {
			heightsOfMountain.add(Integer.valueOf(line));
		}
		 Collections.sort(heightsOfMountain);
		 Collections.reverse(heightsOfMountain);
		 System.out.println(heightsOfMountain.get(0));
		 System.out.println(heightsOfMountain.get(1));
		 System.out.println(heightsOfMountain.get(2));
	}
}
