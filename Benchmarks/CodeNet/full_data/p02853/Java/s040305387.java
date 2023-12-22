import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int total = 0;
    
    if(x == 3){
      total += 100000;
    }else if(x == 2){
      total += 200000;
    }else if(x == 3){
      total += 300000;
    }else{
    }
    
    if(y == 3){
      total += 100000;
    }else if(y == 2){
      total += 200000;
    }else if(y == 3){
      total += 300000;
    }else{
    }
    
    if(x == 1 && y == 1){
      total += 400000;
    }
    
    System.out.println(total);
  }
}
