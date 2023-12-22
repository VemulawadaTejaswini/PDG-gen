import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(1);
for(int i=2;i<=(int)Math.pow(x,0.5);i++){
  boolean judge=true;
  int count=2;
  while(judge){
    if((int)Math.pow(i,count)<=x){
      list.add((int)Math.pow(i,count));
      count++;
    }else{
      judge=false;
    }
  }
}
        System.out.print(list.get(list.size()-1));

  }
}
