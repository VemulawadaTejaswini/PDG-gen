import java.util.*;

class main {
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
        int count = 0;
       	
      if(s1.equals("1")){
       		count = count + 1;
       }else if(s2.equals("1")){
       		count = count + 1;
       }else if(s3.equals("1")){
       		count = count + 1;
       }else {
       		count = count + 0;
       }
      
       System.out.println(count);
    }
}