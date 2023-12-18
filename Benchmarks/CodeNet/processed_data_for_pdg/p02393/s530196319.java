public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = br.readLine();
	    int a = Integer.parseInt(line.split(" ")[0]);
	    int b = Integer.parseInt(line.split(" ")[1]);
	    int c = Integer.parseInt(line.split(" ")[2]);
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(a);
	    list.add(b);
	    list.add(c);
	    Collections.sort(list);
	    String[] strArray = new String[list.size()];
	    for (int i = 0; i < list.size(); i++) {
	    	strArray[i] = Integer.toString(list.get(i));
	    }
	    System.out.println(String.join(" ", strArray));
	}
}
