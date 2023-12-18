public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10001];
		for(int i = 1; i < x.length ; i++) {
			x[i] = sc.nextInt();
		    if(x[i] == 0) break;
		}
		for(int i = 1 ; i < x.length ; i++) {
		    if (x[i] != 0) {
		    	System.out.println("Case " + i +": " + x[i]);
		    }
		}
		sc.close();
	  }
	}
