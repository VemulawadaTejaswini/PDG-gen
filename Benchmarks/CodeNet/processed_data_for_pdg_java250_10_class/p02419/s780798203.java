public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String S,SS;
    SS = sc.next();
    while(true){
      S = sc.next();
      if(S.equals("END_OF_TEXT")){
        break;
      }else{
        if(S.equalsIgnoreCase(SS)){
          count++;
        }
      } 
    }
    System.out.println(count);
  }
}
