import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    //String str = "101";
    int count = 0;
    for(int i = 0; i < 3; i++){
      if(str.charAt(i) == '1'){
        count ++;
      }
    }
    System.out.println(count);
  }
}
