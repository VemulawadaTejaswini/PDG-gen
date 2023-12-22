import java.util.*;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        String week = sc.next();
      	//System.out.print(week);
        if(week=="SUN"){
        	System.out.println(7);
        }else if(week == "MON"){
        	System.out.println(6);
        }else if(week == "TUE"){
        	System.out.println(5);
        }else if(week == "WED"){
        	System.out.println(4);
        }else if(week == "THU"){
        	System.out.println(3);
        }else if(week == "FRI"){
        	System.out.println(2);
        }else if(week == "SAT"){
        	System.out.println(1);
        } 
    }
}