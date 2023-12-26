public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
        String ans = "";
        for(String n : s) {
          if (n.equals("1")) {
            ans += "9";
          } else if (n.equals("9")) {
            ans += "1";
          } else {
            ans += n;
          }
        }
		System.out.println(ans);
	}
}
