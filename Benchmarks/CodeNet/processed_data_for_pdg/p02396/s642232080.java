public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<String>();
		String strLine = "";
		int i = 1;
		int j = 1;
		int k = 0;
		try{
			while(true){
				strLine = insBR.readLine();
				list.add(strLine);
				try{
					i = Integer.parseInt(list.get(k));
				}catch(NumberFormatException e){
					e.printStackTrace();
				}
				if(i != 0){
					System.out.println("Case " + j + ": " + i);
					j++;
					k++;
				}else{
					break;
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
