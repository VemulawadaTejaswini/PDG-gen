import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    List<Integer> numList = new ArrayList<>();
    for(int i = 1;i<10;i++){
      for(int j = 1; j < 10; j++){
        numList.add(i*j);
      }
    }
    if(numList.contains(n)){
      System.out.println("Yes");
    }else{
      System.out.println("No");      
    }
  }
}