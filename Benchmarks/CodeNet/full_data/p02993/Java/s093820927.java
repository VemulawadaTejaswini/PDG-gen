import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    String result = "Good";
    String[] split = s.split("",0);
    for(int i = 0;i < 3;i++){
        if(split[i].equals(split[i+1])){
          result = "Bad";
        }
    }
      System.out.println(result);
  }
}