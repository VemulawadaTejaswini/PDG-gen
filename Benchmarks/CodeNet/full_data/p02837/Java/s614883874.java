import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    int honest = 0,dishonest = 0,h=0;
    ArrayList<Integer> list = new ArrayList<>();
    while(t-->0)
    {
      int n = input.nextInt();
      int g=0;
      while(n-->0)
      {
        int x = input.nextInt();
        int y = input.nextInt();
        list.add(y);
        if(y==0){
          g--;
        }
       	else{
          g++;
        }
      }
      
          if(g<=0)
            dishonest++;
          else
            honest++;
    }
    boolean flag = true;
    for(int i=0;i<list.size();i++)
    {
        if(list.get(i)==0)
            flag = true;
        else{
            flag = false;
            break;
        }
    }
    if(flag)
        honest=1;
    System.out.println(honest);
    
    
    
    
  }
}
