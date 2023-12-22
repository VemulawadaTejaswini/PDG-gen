import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

    	ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= a && i <= b; i++){
          if(a%i == 0 && b%i == 0) list.add(i);
        }
    
        for(int i = 1; i < list.size(); i++){
        	for(int j = i+1; j < list.size(); j++){
            	if(list.get(j) % list.get(i) == 0)
                  list.remove(j);
            }
        }
    	if(list.size() >= 1){
          for(int i = 1; list.size() >= 1 && i < list.size()-1; i++){
              if(list.get(list.size()-1)%list.get(i) == 0){
                list.remove(list.size()-1);
                break;
              }
          }
        }
      	System.out.println(list.size());

    }
}