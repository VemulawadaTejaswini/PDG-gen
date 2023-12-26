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
		    if (h==0||h==H-1) {
			char[] chars = new char[W];
			Arrays.fill(chars, '#');
			System.out.println(new String(chars));
		    } else {
			if (W>2) {
			    char[] chars = new char[W-2];
			    Arrays.fill(chars, '.');
			    System.out.println("#" + new String(chars) + "#");
			} else {
			    char[] chars = new char[W];
			    Arrays.fill(chars, '#');
			    System.out.println(new String(chars));
			}
		    }
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
