public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] sList = sc.next().split("");
        String last = "";
        String ans = "Good";
        for(String s : sList) {
          if (s.equals(last)) {
            ans = "Bad";
            break;
          } else {
            last = s;
          }
        }
		System.out.println(ans);
	}
}
