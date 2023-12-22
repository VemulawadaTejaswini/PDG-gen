
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = scan.nextLine();
    sc.close();
    
    for(char a : str){
      if(a == '7'){
        System.out.print("Yes");
        return;
      }
    }
    System.out.print("No");
  }
}
