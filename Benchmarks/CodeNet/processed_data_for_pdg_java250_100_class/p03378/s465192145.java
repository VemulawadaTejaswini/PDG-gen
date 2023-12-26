public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
        int[] list = new int[n + 1];
        for(int i = 0; i < m; i++) {
          list[sc.nextInt()]++;
        }
        int index = x;
        int ans1 = 0;
        while(index != n) {
          ans1 += list[index];
          index++;
        }
        index = x;
        int ans2 = 0;
        while(index != 0) {
          ans2 += list[index];
          index--;
        }
		System.out.println(Math.min(ans1, ans2));
	}
}
