public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
int t;
    for(int i = 0;i<10000;i++){
      t = sc.nextInt();
      if(t == 0) break;
      System.out.println("Case "+(i+1)+": "+t);
    }
  }
}
