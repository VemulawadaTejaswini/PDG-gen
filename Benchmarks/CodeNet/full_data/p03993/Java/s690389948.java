import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),count=0;
    int[][] a=new int[n][n];
    for(int i=0;i<n;i++) {
    	a[i][sc.nextInt()-1]++;
    }
    for(int i=0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		if(a[i][j]!=0&&a[j][i]!=0) {
    			count++;
    			a[j][i]--;
    		}
    	}
    }
    /*for(int[] i:a) {
    	for(int j:i) {
    	    System.out.print(j+" ");
    	}
        System.out.println();
    }*/
    System.out.println(count);
  }
}
