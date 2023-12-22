import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    int num = sc.nextInt();
    
    while(sc.hasNext()){
      list.add(sc.nextInt());
    }
    Collections.sort(list,  Collections.reverseOrder());
    //System.out.println(list);
      
    int alisNum = 0;
    int bobNum = 0;
    for(int i = 0; i < num; i++){
    	if(i % 2 == 0){
        	alisNum += list.get(i);
          	//System.out.println(alisNum);
        } else {
          	bobNum += list.get(i);
            //System.out.println(bobNum);
        }  
    }  
    System.out.println(alisNum-bobNum);
  }
}