import java.io.*;


public class Main{
  public static void main(String args[])throws Exception{
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
   String [] input = br.readLine().split(" ");
    int n= Integer.parseInt(input[0]);
    int k = Integer.parseInt(input[1]);
    int [] dl= new int[k];
    input = br.readLine().split(" ");
    for(int i=0;i<k;i++){
      dl[i] = Integer.parseInt(input[i]);
    }
    boolean istrue  = false;
    n--;
    do {
    	n++;
    	istrue=isLiked(n,dl);
    }while(istrue == false);
    System.out.println(n);
    
  }
public static boolean isLiked(int n,int []dl){
  char [] str = Integer.toString(n).toCharArray();
  for(int i=0;i<str.length;i++) {
	  for(int j=0;j<dl.length;j++) {
		  if(Integer.parseInt(Character.toString(str[i]))==dl[j]) {
			  return false;
		  }
	  }
  }
  return true;
}
  
}