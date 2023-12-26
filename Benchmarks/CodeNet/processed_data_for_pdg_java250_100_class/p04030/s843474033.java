public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < s.length; i++) {
          if (s[i].equals("B")) {
            if (list.size() > 0) {
             list.remove(list.size() - 1);
            }
          } else {
            list.add(s[i]);
          }
        }
        String ans = "";
        for(String word : list) {
          ans+= word;
        }
		System.out.println(ans);
	}
}
