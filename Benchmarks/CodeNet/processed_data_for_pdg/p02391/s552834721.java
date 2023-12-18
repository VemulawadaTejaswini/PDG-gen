public class Main {
	public static void main(String[] args) throws Exception {
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
            	if(Integer.parseInt(str[0])==Integer.parseInt(str[1])){
            		System.out.println("a == b");
            	}else if(Integer.parseInt(str[0])>Integer.parseInt(str[1])){
            		System.out.println("a > b");
            	}else if(Integer.parseInt(str[0])<Integer.parseInt(str[1])){
            		System.out.println("a < b");
            	}
            	break;
            }
        }
    }
}
