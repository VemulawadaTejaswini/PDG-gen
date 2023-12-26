public class Main { 
    public static void main(String[] args) {
      List<String> list = new ArrayList<String>();
      Scanner sc = new Scanner(System.in);
      Integer Syainsu = Integer.parseInt(sc.next());
      List<Integer> num = new ArrayList<>();
      for (int i=0; i<Syainsu-1; i++) {
          int di = sc.nextInt();
          num.add(di);
      }
      int a[] = new int[Syainsu]; 
      for(int i=0;i<Syainsu;i++){
        a[i] = 0;
    }
      for(int i=0;i<Syainsu-1;i++){
          a[num.get(i)-1]++;
      }
      for(int i=0;i<Syainsu;i++){
	      System.out.println(a[i]);
      }
    }
}
