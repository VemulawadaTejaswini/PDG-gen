import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

	String s =scan.nextLine();
    //scan.next();
    System.out.print('A');
    char ch[] = s.toCharArray();
    for(int i = 0 ; i <ch.length ; i++){
      if(ch[i] >=65 && ch[i]<=90){
        System.out.print(ch[i]);
      }
    }
    System.out.println('C');
  }
}
