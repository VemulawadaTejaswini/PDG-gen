import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int o=0;
       int n=sc.nextInt();
       int[][] v=new int[9][9];
      for(int i=1;i<=n;i++){
      	String str=String.valueOf(i);
		String str1 = str.substring(0, 1);          
		int x = Integer.parseInt(str1);
        int y=i%10;
        //System.out.println(x+""+y);
        if(x!=0&&y!=0)v[x-1][y-1]++;
      }
      for(int i=0;i<9;i++){
      	for(int j=0;j<9;j++){
          //System.out.println(i+1+" " +(int)(j+1)+ " " +v[i][j]);
          o+=v[i][j]*v[j][i];
        }
      }
      System.out.println(o);
    }
}