import java.util.*;
public class Main {
  
	public static void main(String[] args) {
      
    	Scanner sc = new Scanner(System.in);
      	int k = sc.nextInt();
      	int n = sc.nextInt();
      
        // 目的地点のリスト points を作成
     	List<Integer> points = new ArrayList<Integer>(n);
      	for (int i = 0; i <  n; i++) {
          points.add(sc.nextInt());
        }
      
      	// 各地点の距離の最大値を求める
      	int maxValue = 0;
      	int val;
      	
      	for (int i = 0; i < n; i++) {
        	for (int j = 0; j < i; j++) {
              val = Math.min(points.get(i) - points.get(j), points.get(j) + k - points.get(i));
              maxValue = val > maxValue ? val : maxValue; 
            }
        }
      System.out.println(maxValue);
    }
 }