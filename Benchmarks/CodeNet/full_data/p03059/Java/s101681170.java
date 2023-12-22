import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	String[] spi = new String[n];
      	int list = 0;
      	for(int i = 0; i < n; i ++){
        	String value = sc.next();
          	String cost = sc.next();
          	spi[i] = value + "_" + cost;
          	list += value - cost;
        }
      	Arrays.sort(spi);
      	for(String s : spi){
          	int value = Integer.parseInt(s.split("_")[0]);
          	int cost = Integer.parseInt(s.split("_")[1]);
        	list = Math.max(list, list - value + cost);
        }
      	System.out.print(list);
      	
    }
}