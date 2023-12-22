import java.util.Scanner;
public class Main{
	public static void main(String [] args){
    
    	Scanner sc=new Scanner(System.in);
      	String a=sc.next();
      String b=sc.next();
      char str1[]=a.toCharArray();
      char str2[]=b.toCharArray();
      
      String res=lcs(str1,str2,a.length(),b.length());
      //@todo find lcs
      System.out.println(res);
    }
  
  	static
  	 String lcs(char a[], char b[], int l1, int l2){
    
    	int l[][]=new int[ l1+1 ][ l2+1 ];
      	for(int i=0;i<=l1;i++){
        	for(int j=0;j<=l2;j++){
            	
              if(i==0 || j==0)
                l[i][j]=0;
              else if( a[i-1] == b[j-1])
                l[i][j]=l[i-1][j-1]+1;
              else 
                l[i][j]=Math.max(l[i-1][j],l[i][j-1]);
            }
        }
      	
      	int i=l1;
      	int j=l2;
      String res="";
      	while(i !=0 && j!=0){
        	
          int temp=l[i][j];
          if(temp == l[i-1][j])
            i--;
           else if(temp == l[i][j-1])
             j--;
             else
             {
             	res=a[i-1]+res;
               i--;
               j--;
             }
        }
      
      return res;
      
    } 
}