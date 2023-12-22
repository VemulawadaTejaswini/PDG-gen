import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    
    String[] array = new String[input.length()];
    boolean result = true;
    for(int i = 0;i < input.length();i++){
      array[i] = String.valueOf(input.charAt(i));
    }
    
    
    Arrays.sort(array);
    String old = array[0];
    int count = 0;
    int totalCount = 0;
    for(int x = 0;x < array.length;x++){
     if(old.equals(array[x])){
       count++;
     }else{
       totalCount += count;
       count = 1;
     }
      
     if(x == array.length-1){
       totalCount += count;
     } 
      old = array[x];
    }
    
    System.out.println(totalCount % 2 == 0 ? "Yes" : "No");
  }
}