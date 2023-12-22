import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = Integer.parseInt(sc.next());
  int k = Integer.parseInt(sc.next());
  int[] m = new int[n];
  for (int i = 0; i < n; i++){
  	m[i] = Integer.parseInt(sc.next());
  }
  if (k>=n){
  System.out.println(0);
  }
  if(k<n){
    int turn = 0;
  	while(k >0 ){
    	int maxHP = 0;
      	int max = 0;
      	for (int i = 0; i<n; i++){
        	if (maxHP<m[i]){
            	maxHP=m[i];
              	max = i;
            }
        }
      	m[max] = 0;
      	k--;
    }
    for (int i = 0; i<n; i++){
    	if (m[i] > 0){
        	while(m[i] > 0){
            m[i]--;
              turn++;
            }
        }
    }
    System.out.println(turn);
  }
}
}