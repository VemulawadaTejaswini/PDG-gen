import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    String sub = "";
    int count = 0;
    for(int i = 0; i < s.length(); i++){
        for(int j = i+1; j < s.length(); j++){
            sub = s.substring(i, j+1);
            long k = Long.parseLong(sub);
            if(k%2019 == 0){
                count++;
                break;
                
            }
        }
    }
    System.out.println(count);
  }
}