 public class Main{
  
  public static void main(String[] args){
    
    if(args[4].equals(args[0])){
      int ball1 = Integer.parseInt(args[2]) - 1;
    }
    else if(args[4].equals(args[1])){
      int ball2 = Integer.parseInt(args[3]) - 1;
    }
    
    system.out.println(ball1+" "+ball2);
    
  }
}