public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] best = {0, 0, 0};		
        for(int i=0; i<10; i++){
            String line = br.readLine();			
            int height = Integer.parseInt(line);	
            if(height > best[0]){	
            	best[2] = best[1];
            	best[1] = best[0];
            	best[0] = height;
            }
            else if(height > best[1]){
            	best[2] = best[1];
            	best[1] = height;
            }
            else if(height > best[2]){
            	best[2] = height;
            }
        }
        for(int h: best){
        	System.out.println(h);
        }
	}
}
