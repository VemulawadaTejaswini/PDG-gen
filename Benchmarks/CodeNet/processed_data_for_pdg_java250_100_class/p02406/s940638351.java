public class Main{
    static StringBuilder sb;
    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();
	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		lines.add(line);
	    }
	    br.close();
	    Integer n = Integer.parseInt(lines.get(0));
	    sb = new StringBuilder();
	    for (int i = 1; i <= n; i++) {
		if (i%3==0) {
		    sb.append(" " + i);
		} else if (i%10==3) {
		    sb.append(" " + i);
		} else if (String.valueOf(i).contains("3")) {
		    sb.append(" " + i);
		}
	    }
	    System.out.println(sb.toString());
	    System.exit(0);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}
