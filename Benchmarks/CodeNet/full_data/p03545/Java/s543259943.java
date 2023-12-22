import java.util.*;
 
public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String ABCD = sc.next();
    char[] abcd = ABCD.toCharArray();
    
    int[] num =new int[4];
    for(int i = 0; i < abcd.length; i++){
      num[i] = Character.getNumericValue(abcd[i]);
    }
    
    
    if(num[0]+num[1]+num[2]+num[3]==7){
      System.out.println(num[0]+"+"+num[1]+"+"+num[2]+"+"+num[3]+"="+7);
    }else if(num[0]+num[1]+num[2]-num[3]==7){
      System.out.println(num[0]+"+"+num[1]+"+"+num[2]+"-"+num[3]+"="+7);
    }else if(num[0]+num[1]-num[2]-num[3]==7){
      System.out.println(num[0]+"+"+num[1]+"-"+num[2]+"-"+num[3]+"="+7);
    }else if(num[0]-num[1]-num[2]-num[3]==7){
      System.out.println(num[0]+"-"+num[1]+"-"+num[2]+"-"+num[3]+"="+7);
    }else if(num[0]-num[1]+num[2]-num[3]==7){
      System.out.println(num[0]+"-"+num[1]+"+"+num[2]+"-"+num[3]+"="+7);
    }else if(num[0]+num[1]-num[2]+num[3]==7){
      System.out.println(num[0]+"+"+num[1]+"-"+num[2]+"+"+num[3]+"="+7);
    }else if(num[0]-num[1]-num[2]+num[3]==7){
      System.out.println(num[0]+"-"+num[1]+"-"+num[2]+"+"+num[3]+"="+7);
    }else if(num[0]-num[1]+num[2]+num[3]==7){
      System.out.println(num[0]+"-"+num[1]+"+"+num[2]+"+"+num[3]+"="+7);
    }
      
  }  
}