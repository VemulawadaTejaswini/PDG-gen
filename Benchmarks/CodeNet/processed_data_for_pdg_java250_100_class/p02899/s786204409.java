public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder ans = new StringBuilder();
        Map<String,Integer> map = new HashMap<>();
		for (int i = 1; i <= N;i ++ ){
			String str = sc.next();
        	map.put( str,i);
		}
		for (int i = 1; i <= N;i ++ ){
			ans.append(map.get(String.valueOf(i))+" ");
		}
		System.out.println(ans);
   		sc.close();
        return ;
    }
}
