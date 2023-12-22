import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn= new Scanner(System.in);
    int k=scn.nextInt();
    int n =scn.nextInt();
    int [] arr =new int[n];
    for(int i=0;i<n;i++){
    	arr[i]=scn.nextInt();
    	
    }
    int max=0;
    for(int i=1;i<arr.length;i++){
      max=Math.max(Math.abs(arr[i-1]-arr[i]),max);
      
    }
    System.out.println(k-max);
    }

}