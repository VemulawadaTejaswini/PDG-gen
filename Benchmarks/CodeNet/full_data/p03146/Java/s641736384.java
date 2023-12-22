import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int input = sc.nextInt();
      int count = 1;
      ArrayList<Integer>array = new ArrayList<Integer>();
      int newNum = 0;
      
      while(true){
        if(count==1){
          newNum = input;
        }else{
          int num = array.get(array.size()-1);
          if(num%2==0){
            newNum= num/2;
          }else{
            newNum= num*3+1;
          }
        }
        if(array.contains(newNum)){
          break;
        }else{
          array.add(newNum);
          count++;
        }
      }
      System.out.println(count);
	}
}