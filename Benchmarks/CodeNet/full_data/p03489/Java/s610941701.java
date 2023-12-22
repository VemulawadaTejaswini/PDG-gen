class Good_Sequence {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int array[] = new int[num];
    ArrayList<Integer> table = new ArrayList<Integer>();
    int n = 0;
    int sum = 1;
    int ans = 0;
    boolean flag = false;

    for ( int i = 0; i < num; i++ ) {
      array[i] = scan.nextInt();
    }

    for ( int k = 0; k < num; k++ ) {
      for ( int a = 0; a < n; a++ ) {
        if ( array[k] == table.get(a) ) {
           // System.out.println("out");
           flag = true;
        }
      }
      if ( flag == true ) { flag = false; break; }
      for ( int j = k + 1; j < num; j++ ) {
        if ( array[k] == array[j] ) {
          sum++;
        }
      }
      if ( array[k] <= sum ) {
        ans += sum - array[k];
      } else {
        ans += sum;
      }
      table.add(new Integer(array[k]));
      n++;
      sum = 1;
    }
    System.out.println(ans);
  }
}
