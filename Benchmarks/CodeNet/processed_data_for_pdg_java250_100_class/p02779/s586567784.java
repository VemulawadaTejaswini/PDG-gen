public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    Set<Integer> st = new HashSet<>();
    for(int i=0; i<n; i++) {
      st.add(Integer.parseInt(str[i]));
    }
    System.out.println(st.size() == n?"YES":"NO");
  }
}
