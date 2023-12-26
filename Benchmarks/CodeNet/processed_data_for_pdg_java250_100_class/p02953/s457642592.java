public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		String result = "Yes";
		for(int i = 0; i < n; i++){
		    h[i] = sc.nextInt();
		    if(i > 0 && h[i - 1] < h[i]){
                h[i]--;		        
		    }else if(i > 0 && h[i - 1] > h[i]){
		        result = "No";
		    }
		}
        System.out.println(result);
	}
}
