import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String in = scan.next();
        scan.close();
        
        int result = 0;
        char prev;
        char latter;
        for(int pointer=0;pointer<in.length()-1;pointer++){
          //System.out.println(pointer);
          //System.out.println(in);
          prev = in.charAt(pointer);
          latter = in.charAt(pointer+1);
          if((prev=='0'&&latter=='1')||(prev=='1'&&latter=='0')){
            result = result+2;
            //System.out.println(in.substring(pointer+2,in.length()));
            in = in.substring(0,pointer)+in.substring(pointer+2,in.length());
            if(pointer!=0)pointer=pointer-2;
            //System.out.println(in);
          }
        }
      System.out.println(result);
      
	}
}