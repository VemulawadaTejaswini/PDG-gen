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
    
		int[] check = new int[list.size()];
    	for(int i = 1; i < list.size(); i++){
        	for(int j = i+1; j < list.size(); j++){
              	if(check[j] == 0){
            		if(list.get(j) % list.get(i) == 0) check[j] = 1;
                }
            }
        }
    
    	int count = 0;
    	for(int i = 0; i < check.length; i++)
          if(check[i] == 0) count++;
    	System.out.println(count);
    }
}