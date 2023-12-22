import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[]str=new String[count];
      for(int i=0;i<count;i++){
        str[i]=sc.next();
        }
      int result=0;
      
      for(int i=0;i<str.length;i++){
        String tmp=str[i];
        int len =0;
        result--;
        for(int j=0;j<str.length;j++){
        	String tmp2=str[j];
          for(int k=0;k<tmp.length();k++) {
        	  if(len==tmp.length()) {
    			  result++;
    			  break;
    		  }
        	  for(int o=0;o<tmp2.length();o++) {
        		  if(tmp.charAt(k)==tmp2.charAt(o)){
        			  tmp2=tmp2.replaceFirst(String.valueOf(tmp.charAt(k)), "");
                    len++;
                    break;
        		  }
        	  }
          }

        }
      }
      System.out.println(result);
	}
}