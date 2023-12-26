public class Main { 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      Set<String> numSet = new HashSet<>();
      for (int i=0; i<n; i++) {
          String di = sc.next();
          numSet.add(di);
      }
      System.out.println(numSet.size());
    }
}
