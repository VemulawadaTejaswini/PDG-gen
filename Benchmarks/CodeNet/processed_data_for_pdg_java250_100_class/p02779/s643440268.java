public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        boolean ans = true;
        List<String> list = new ArrayList<String>();
        for(int i = 0;i < n;i++){
          list.add(sc.next());
        }
        ans = (list.size() == new HashSet<>(list).size());
        if(ans == false){
          System.out.println("NO");
          return;
          }
        System.out.println("YES");
    }
}
