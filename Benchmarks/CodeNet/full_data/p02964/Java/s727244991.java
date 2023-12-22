import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int N = sc.nextInt();
    long K = sc.nextLong();
  int[] A =new int[N];
    int i =0;
  int ind =0;
    List<Integer> intList = new ArrayList<Integer>();   
	for(i=0;i<N;i++){
      A[i]=sc.nextInt();
      ind=intList.indexOf(A[i]);
      if(ind<0){
        intList.add(A[i]);
      }else{
        intList=intList.subList(0,ind);
      }
    }
  if(K>1){
  	for(i=0;i<N;i++){
      ind=intList.indexOf(A[i]);
      if(ind<0){
        intList.add(A[i]);
      }else{
        intList=intList.subList(0,ind);
      }
    }
  }
  for(int k:intList){
    System.out.print(k+" ");
  }
  }
} 