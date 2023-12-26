public class Main {
	public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line,store="";
            boolean first=true;
            int sum=0;
            while ((line = br.readLine()) != null) {
            	if(line.equals("END_OF_TEXT"))break;
            	if(first){
            		store=line.toLowerCase();
            		first=false;
            	}else{
            		String[] str = line.split(" ");
            		for(int i=0;i<str.length;i++){
            			if(store.equals(str[i].toLowerCase())){
            				sum++;
            			}
            		}
            	}
            }
            System.out.println(sum);
        }
    }
}
