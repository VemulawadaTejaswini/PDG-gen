public class Main {
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	Map<Integer, Boolean> map = new HashMap<>();
    	for(int i = 0; i < n; i++){
    		int a  = sc.nextInt();
    		if(null != map.get(a)){
    			System.out.println("NO");
    			sc.close();
    			return;
    		}else{
    			map.put(a, true);;
    		}
    	}
    	sc.close();
    	System.out.println("YES");
    }
}
