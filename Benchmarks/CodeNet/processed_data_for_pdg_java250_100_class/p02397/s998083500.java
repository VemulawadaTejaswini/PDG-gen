public class Main {
	public static void main(String[] args) throws Exception{
		int s = 0;
		int i = 0;
		String tN;
		ArrayList<String> array = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        	String line = br.readLine();
        	line = line.trim();
        	String[] readLineArray = line.split("[\\s+]");
        	int a = Integer.parseInt(readLineArray[0]);
        	int b = Integer.parseInt(readLineArray[1]);
        	if(a == 0 && b == 0){
        		break;
        	}else if(a > b){
        		s = a;
        		a = b;
        		b = s;
        	}
        	tN = (a+" "+b);
            array.add(tN);
        	i++;
        }
        int N = i;
        for(i = 0;i<N;i++){
        	System.out.println(array.get(i));
        }
    }
}
