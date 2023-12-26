public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int ln = 1;
    int bounds[] = new int[n];
    for(int idx=0; idx<n; idx++){
      bounds[idx] = sc.nextInt();
    }
    for(int idx=0; idx<n; idx++){
      l -= bounds[idx];
      if(l < 0){
        break;
      }
      ln += 1;
    }
    System.out.println(ln);   
  }
}
