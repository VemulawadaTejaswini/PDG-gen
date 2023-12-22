import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
      	String s = in.next();
     	s = s.replace("dreameraser","");
      	s = s.replace("dreamerase","");
      	s = s.replace("dreamer","");
      	s = s.replace("dream","");
      	s = s.replace("eraser","");
      	s = s.replace("erase","");
      
      	if(s.isEmpty())
       	System.out.println("YES");
      	else System.out.println("NO");
    }
}