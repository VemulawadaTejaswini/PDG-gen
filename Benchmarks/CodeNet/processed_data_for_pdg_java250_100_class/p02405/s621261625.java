public class Main{
    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();
	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		lines.add(line);
	    }
	    br.close();
	    for (Integer i = 0; i < lines.size(); i++) {
		String[] splits = lines.get(i).split(" ");
		Integer H = Integer.parseInt(splits[0]);
		Integer W = Integer.parseInt(splits[1]);
		if (H==0&&W==0) {
		    System.exit(0);
		}
		for (int h = 0; h < H; h++) {
		    char[] chars = new char[W];
		    Arrays.fill(chars, '#');
		    StringBuilder sb = new StringBuilder(new String(chars));
		    for (int j=0; j<chars.length;j++) {
			if (h%2==0 && j%2==1) {
			    sb.setCharAt(j,'.');
			} else if (h%2==1 && j%2==0) {
			    sb.setCharAt(j,'.');
			}
		    }
		    System.out.println(sb.toString());
		}
		System.out.println("");
	    }
	    System.exit(0);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}
