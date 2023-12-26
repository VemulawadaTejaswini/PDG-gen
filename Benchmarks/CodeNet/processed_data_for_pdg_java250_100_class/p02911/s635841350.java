class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    ArrayList<Integer> plyr = new ArrayList<Integer>(n);
    for (int i=0 ; i<n ; i++){
      plyr.add(k-q);
    }
    for (int i=0 ; i<q ; i++){
      int se = sc.nextInt()-1;
      plyr.set(se, plyr.get(se) + 1);
    }
    for(int i=0;i<n;i++){
      if(plyr.get(i) < 1){
          System.out.println("No");
      }else{
          System.out.println("Yes");
      }
    }
  }
}
