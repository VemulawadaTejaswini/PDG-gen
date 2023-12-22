import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	double a = sc.nextDouble();
    double b = sc.nextDouble();
    int itema = (int)(a / 0.08);
    int itemb = (int)(b / 0.1);
    if(itema > itemb){
      int tmp = (int)((double)itema * 0.1);
      if(tmp == (int)a){
        System.out.println(itema);
      }
      else
      {
        System.out.println(-1);
      }
    }
    else
    {
      int tmp = (int)((double)itemb * 0.08);
      if(tmp == (int)b){
        System.out.println(itemb);
      }
      else
      {
        System.out.println(-1);
      }
    }
    
    
    //HashMap<String,Integer> map = new HashMap<String,Integer>();
    //LinkedList<String> array = new LinkedList<String>();
    //int max = 1;
    /*
    for(int i = 0; i < n; i++){
      String s = sc.next();
      int tmp = 1;
      if(map.containsKey(s)){
        tmp = map.get(s)+1;
      }
      map.put(s, tmp);
      
      if(tmp == max){
        array.add(s);
      } 
      else if(tmp > max){
        max = tmp;
        array.clear();
        array.add(s);
      }
    }
    */
    //array.sort(Comparator.naturalOrder());
    //for(String value : array)
	//{
      //System.out.println(value);
	//}
  }
}