public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s = br.readLine();
	    String p = br.readLine();
	    String targetStr = s + s;
	    StringBuilder sb = new StringBuilder();
        Pattern ptn = Pattern.compile(p);
        Matcher matcher = ptn.matcher(targetStr);
        if(matcher.find()){
            sb.append("Yes");
        }else{
            sb.append("No");
        }
        System.out.println(sb.toString());
	}
}
