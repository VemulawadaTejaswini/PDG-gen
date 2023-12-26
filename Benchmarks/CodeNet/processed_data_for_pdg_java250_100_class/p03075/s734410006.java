public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  
    int d=0;
    for (int i=1; i<=4; i++){
      d=sc.nextInt();
    }
    int k=sc.nextInt();
    if (d-a>k){
      System.out.println(":(");
    } else {
      System.out.println("Yay!");
    }
  }
}
