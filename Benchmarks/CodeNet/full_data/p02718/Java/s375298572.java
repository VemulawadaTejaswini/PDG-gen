import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int kind=scan.nextInt();
    int cho=scan.nextInt();
    PriorityQueue in=new PriorityQueue();
    int full=0;
    for(int a=0; a<kind; a++){
      int input=scan.nextInt();
      full+=input;
      in.offer(input);
    }
    int ans=0;
    for(int a=kind; a>=cho; a--){
      ans=(int)in.poll();
    }
    //System.out.println(ans+" "+full/(4*cho));
    if(full/(4*cho)<ans){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}