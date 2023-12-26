public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int tmp = 0;
    	int max = 0;
    	int sum = 0;
    	for(int i = 0; i < n; i++){
    		tmp = sc.nextInt();
    		if (tmp > max){
    			max = tmp;
    		}
    		sum += tmp;
    	}
    	String ans ="";
    	if(max < (sum - max)){
    		ans = "Yes";
    	} else {
    		ans = "No";
    	}
    	System.out.println(ans);
    }
}
