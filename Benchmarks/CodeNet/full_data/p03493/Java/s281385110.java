import java.util.Scanner;

public class Main{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String str =s.next();
    int sum = 0;

    for(int i =0;i<str.length();i++){
      char splitstr = str.charAt(i);
      if(splitstr == '1'){
        sum += 1;
      }else{
      }


    }
System.out.println(sum);




  }
}
