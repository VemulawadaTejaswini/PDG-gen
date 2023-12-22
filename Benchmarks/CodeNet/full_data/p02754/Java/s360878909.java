import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int countAll = 0;
    int countBlue = 0;
    while(n > countAll){
      countAll += a;
      countBlue += a;
      if(n < countAll){
        countBlue -= countAll - n;
        break;
      }
      else
      {
        countAll += b;
      }
    }
    
    System.out.println(countBlue);
    
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