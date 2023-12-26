public class Main {
	public static void main(String args[])throws IOException,NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		int sum;
		char c;
		sum = 0;
		while(true){
			str=br.readLine();
			if(str.length() == 1){
				if(Integer.parseInt(str) == 0){
				break;
				}
			}
			for(int count = 0;count<str.length();count++){
				c = str.charAt(count);
				sum += Integer.parseInt(String.valueOf(c));
			}
		sb.append(sum);
		sb.append("\n");
		sum = 0;
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(new String(sb));
	}
}
