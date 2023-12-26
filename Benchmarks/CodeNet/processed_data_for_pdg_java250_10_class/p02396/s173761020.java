  public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> ary = new ArrayList<>();
      while (true) {
        int input = Integer.parseInt(sc.next());
        ary.add(input);
        if (input == 0)break;
      }
      for(int i = 0; i < ary.size()-1; i++){
        System.out.println("Case " + (i+1) + ": " +ary.get(i));
      }
    }
  }
