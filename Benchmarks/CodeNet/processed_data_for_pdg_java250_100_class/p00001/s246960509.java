public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int height[] = new int[10];
		int out[] = {0,0,0}; 
		for(int i = 0; i < 10; i++){
			try{
				height[i] = Integer.parseInt(in.readLine());
			}catch(IOException e){}
		}
		for(int i = 0; i < height.length; i++){
			if(out[0] < height[i] ){
				out[2] = out[1];
				out[1] = out[0];
				out[0] = height[i];
			}else if(out[1] < height[i]){
				out[2] = out[1];
				out[1] = height[i];
			}else if(out[2] < height[i]){
				out[2] = height[i];
			}
		}
		for(int i = 0; i < out.length; i++){
			System.out.println(out[i]);
		}
	}
}
