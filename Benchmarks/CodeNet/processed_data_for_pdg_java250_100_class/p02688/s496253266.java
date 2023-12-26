class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int K=sc.nextInt();
    int count=0;
    List<Integer> As = new ArrayList<>();
    List<Integer> Bs = new ArrayList<>();
    for (int i=1;i<=N ;i++ ) {
       As.add(i);
    }
    for(int i=0;i<K;i++){
      int d=sc.nextInt();
      for (int j=0;j<d ;j++ ) {
         Bs.add(sc.nextInt());
      }
    }
    List<Integer> Cs = new ArrayList<Integer>(new HashSet<>(Bs));
       for(int i=1;i<=N;i++){
         if(!(Cs.contains(i))){
            count++;
         }
       }
       System.out.println(count);
  }
}
