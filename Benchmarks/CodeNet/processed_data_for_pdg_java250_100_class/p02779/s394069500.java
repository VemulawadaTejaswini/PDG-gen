public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      HashSet youso = new HashSet();
      for(int i =1; i<=N; i++){
      		youso.add(sc.next());
      }
      if((youso.size())==(N)){
      	System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
}
