/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
  int m=sc.nextInt();
  int arr[][]=new int[m][3];
  for(int i=0;i<m;i++){
    for(int j=0;j<3;j++){
    arr[i][j]=sc.nextInt();
    }
  }
  int sto[][]=new int[m+1][3];
  sto[1][0]=arr[0][0];
  sto[1][1]=arr[0][1];
  sto[1][2]=arr[0][2];
  for(int i=2;i<=m;i++){
  sto[i][0]=arr[i-1][0]+Math.max(sto[i-1][1],sto[i-1][2]);
    sto[i][1]=arr[i-1][1]+Math.max(sto[i-1][0],sto[i-1][2]);
    sto[i][2]=arr[i-1][2]+Math.max(sto[i-1][1],sto[i-1][0]);
  }
  int maxi=Math.max(sto[m][0],Math.max(sto[m][1],sto[m][2]));
  System.out.println(maxi);
	}
}