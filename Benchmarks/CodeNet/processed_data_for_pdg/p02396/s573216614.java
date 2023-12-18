public class Main {
	public static void main(String[] args){
		String str = null;
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=1;;i++){
		try {str = br.readLine();} 
		catch (IOException e) {e.printStackTrace();}
		int j = Integer.parseInt(str);
		if(0==j){
			break;
			}else{
		System.out.println("Case "+ i +": "+j);
		}
		}
		}
}
