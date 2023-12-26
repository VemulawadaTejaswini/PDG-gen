public class Main {
	public static void main(String[] args) {
		 BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int[] height = new int[10];
			for (int i = 0; i < 10; i++) {
					try {
						height[i] = Integer.parseInt(reader.readLine());
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
			Arrays.sort(height);
			for(int i=9;i>6;i--){
				System.out.println(height[i]);
			}
		}
}
