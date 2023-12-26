public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();  
    int y = sc.nextInt();  
    boolean flag = false;
    int num = 0;
    for(int i=0; i<=x; i++){
      num = 2 * i + 4 * (x-i);
      if(num==y){
        flag = true;
      }
    }
    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
