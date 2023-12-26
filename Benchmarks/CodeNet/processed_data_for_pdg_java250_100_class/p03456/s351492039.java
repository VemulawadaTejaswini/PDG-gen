public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int target = Integer.parseInt(a + b);
    boolean flag = false;
    for(double i = 1; i <= Math.sqrt(target); i++){
      if((double)target / i == i){
        flag = true;
        break;
      }
    }
    if(flag){System.out.println("Yes");}
    else{System.out.println("No");}
  }
}
