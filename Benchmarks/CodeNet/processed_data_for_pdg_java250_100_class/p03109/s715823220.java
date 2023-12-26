public class Main {
	public static void main(String[] args) throws IOException, ParseException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	String tmp = "2019/04/30";
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    	Date criteria = sdf.parse(tmp);
    	Date now = sdf.parse(str);
    	if (now.after(criteria)) {
    		System.out.println("TBD");
    	} else {
    		System.out.println("Heisei");
    	}
	}
}
