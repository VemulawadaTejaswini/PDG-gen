public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final char[] mark = {'S','H','C','D'};
		String[][] cards = new String[4][13];
		try {
			int cardNum = Integer.parseInt(br.readLine());
			String str;
			for(int i=0;i<cardNum;i++){
				str = br.readLine();
				for(int j=0;j<mark.length;j++){
					if(str.charAt(0) == mark[j]){
						cards[j][Integer.parseInt(str.substring(2,str.length()))-1] = "";
						break;
					}
				}
			}
			for(int i=0;i<mark.length;i++){
				for(int j=0;j<cards[i].length;j++){
					if(cards[i][j] == null)
						sb.append(mark[i]).append(" ").append((j+1)).append("\n");
				}
			}
			System.out.print(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(br != null){
					br.close();
				}
			}catch(IOException ioe){
			}
		}
	}
}
