import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int N = sc.nextInt();
    //int[] count = new int[N];
    String str = sc.next();
    int max = 0;
    int count = 0;
    
    for(int i=0; i < str.length(); i++){
        if(str.charAt(i) == 'A' || str.charAt(i) == 'C' || str.charAt(i) == 'G' || str.charAt(i) == 'T'){
            count++;
        }else{
            count = 0;
        }
        if(max < count){
            max = count;
        }
    }
    //if(str[0].equals("H"));
    System.out.println(max);
  }
}