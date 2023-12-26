public class Main { 
    public static void main(String[] args) {
      List<String> list = new ArrayList<String>();
      Scanner sc = new Scanner(System.in);
      Integer ndate = Integer.parseInt(sc.next());
      Integer msyuku = Integer.parseInt(sc.next());
      List<Integer> num = new ArrayList<>();
      for (int i=0; i<msyuku; i++) {
          int di = sc.nextInt();
          num.add(di);
      }
      int asobu = 0;
      for (int n : num){
          ndate -= n;
      }
      if(ndate < 0){
          ndate = -1;
      }
      System.out.println(ndate);
    }
}
