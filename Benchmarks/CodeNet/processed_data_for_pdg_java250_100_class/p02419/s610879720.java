public class Main{
    public static void main(String[] args) throws IOException {
	BufferedReader br = null;
	try {
	    br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();
	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		lines.add(line);
	    }
	    String keyword = lines.get(0).toLowerCase();
	    Integer count = 0;
	    for (int i = 1; i < lines.size() - 1; i++) {
		for (String e : lines.get(i).split(" ")) {
		    String word = e.toLowerCase();
		    if (word.equals(keyword)) {
			count++;
		    }
		}
	    }
	    System.out.println(count);
	    System.exit(0);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	} finally {
	    br.close();
	}
    }
}
