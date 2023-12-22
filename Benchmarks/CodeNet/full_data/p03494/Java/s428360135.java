    public class Main {
      public static void main(String[] args) {
    	java.util.Scanner scanner = new java.util.Scanner(System.in);
    	int n = scanner.nextInt();
    	int[] a = new int[n];
    	for (int i = 0; i < n; i++) {
    		a[i] = scanner.nextInt();
    	}
     
    	int[] count = new int[n];
    	for (int i = 0; i < n; i++) {
                            // 2で割れる回数をチェック
    		while (a[i] % 2 == 0) {
    			a[i] = a[i] / 2;
    			count++;
    		}
    		count[i]++;
    	}
          java.util.Arrays.sort(count);
    	System.out.println(count[0]);
      }
    }