public class Main {
	public static void main(String[] args) throws Exception {
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0;
            while ((line = br.readLine()) != null) {
            	if(line.equals("0")){
            		break;
            	}else{
            		i++;
            		System.out.println("Case "+i+": "+line);
            	}
            }
        }
    }
}
