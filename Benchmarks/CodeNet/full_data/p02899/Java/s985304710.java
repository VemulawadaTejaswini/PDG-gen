    import java.util.HashMap;
    import java.util.Scanner;
    public class Main {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int N = sc.nextInt();
    		HashMap<String,String> map = new HashMap<>();
    		for(int i = 1;i<=N;i++) {
    			map.put(sc.next(),String.valueOf(i));
    		}
    		for(int j = 1;j<=N;j++) {
    			System.out.print(map.get(String.valueOf(j))+" ");
    		}
    	}
    }