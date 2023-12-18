public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i = 1;
    while(true){
      int a = sc.nextInt();
      if(a == 0){
        break;
      }else{;
        System.out.printf("Case %d: %d\n", i, a);
        i=i+1;
      }
    }
    sc.close();
  }
}
