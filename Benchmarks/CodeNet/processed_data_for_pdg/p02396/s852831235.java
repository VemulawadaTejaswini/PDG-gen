  public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> ary = new ArrayList<>();
      while (true) {
        int input = Integer.parseInt(sc.next());
        if (input == 0)break;
        ary.add(input);
      }
      for(int i = 0; i < ary.size(); i++){
        System.out.println("Case " + (i+1) + ": " +ary.get(i));
      }
    }
  }
