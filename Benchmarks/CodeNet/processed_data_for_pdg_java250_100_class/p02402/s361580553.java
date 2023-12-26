public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strs = str.split(" ");
        int min = 0;
        int max = 0;
        long sum = 0;
        if(strs.length > 0){
            min = Integer.parseInt(strs[0]);
            max = Integer.parseInt(strs[0]);
        }
        for(int i = 0; i < n; i++){
            if(min > Integer.parseInt(strs[i])){
                min = Integer.parseInt(strs[i]);
            }else if(max < Integer.parseInt(strs[i])){
                max = Integer.parseInt(strs[i]);
            }
            sum += Integer.parseInt(strs[i]);
        }
        System.out.println(min + " " + max + " " + sum);
	}
}
