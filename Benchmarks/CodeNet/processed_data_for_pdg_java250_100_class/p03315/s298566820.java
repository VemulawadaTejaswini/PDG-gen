public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
        int ans = 0;
        for(String n : s) {
          if ("+".equals(n)) {
            ans++;
          } else {
            ans--;
          }
        }
		System.out.println(ans);
	}
}
