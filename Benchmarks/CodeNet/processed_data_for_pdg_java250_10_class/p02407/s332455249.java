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
	    String[] array = new String[Integer.parseInt(lines.get(0))];
	    String[] reverse = new String[Integer.parseInt(lines.get(0))];
	    for (int i = 0; i < array.length ; i++) {
		array[i] = lines.get(1).split(" ")[i];
	    }
	    sb = new StringBuilder();
	    for (int i = array.length - 1; i >= 0 ; i--) {
		if ( i != 0 ) {
		    sb.append(array[i] + " ");
		} else {
		    sb.append(array[i]);
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
