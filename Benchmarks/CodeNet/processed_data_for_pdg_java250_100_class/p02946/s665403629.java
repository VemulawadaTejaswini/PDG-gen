public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
        int point = x - k + 1;
        int wide = (2 * k) - 1;
        String ans = "";
        for (int i =  x - k + 1; i < wide + point; i++) {
          ans += i;
          ans += " ";
        }
		System.out.println(ans);
	}
}
