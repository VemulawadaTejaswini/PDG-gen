import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bill = sc.nextInt();
    int numCnt = sc.nextInt();
    String[] array = new String[numCnt];
    for(int i = 0; i < numCnt;i++){
      array[i] = String.valueOf(sc.nextInt());
    }
	
    
    while(true){
      boolean check = false;
      String strBill = String.valueOf(bill);
      for(int x = 0;x < strBill.length();x++){
        if(Arrays.asList(array).contains(String.valueOf(strBill.charAt(x)))){
          check = true;
          break;
        }
      }
      if(!check){
        break;
      }
      bill++;
    }
    
    System.out.println(bill);
  }
}