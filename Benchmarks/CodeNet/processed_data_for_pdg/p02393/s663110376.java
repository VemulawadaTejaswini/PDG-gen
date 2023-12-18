public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < 3; i++) {
      int n = sc.nextInt();
      list.add(n);
    }
    int length = list.size();
    for(int i = 0; i < length - 1; i++) {
      for(int j = length - 1; j > i; j--) {
        if (list.get(j - 1) > list.get(j)) {
          int min = list.get(j - 1);
          list.set(j - 1,list.get(j));
          list.set(j, min);
        }
      }
    }
    String answer = "";
    for(int i = 0; i < length; i++) {
      if(i != 2) {
        answer += list.get(i) + " ";
      } else {
        answer += list.get(i);
      }
    }
    System.out.println(answer);
    sc.close();
  }
}
