import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String day = br.readLine();
        if(day.equals("SUN")){
          System.out.println("7");
        }else if(day.equals("MON")){
          System.out.println("6");
        }else if(day.equals("TUE")){
          System.out.println("5");
        }else if(day.equals("WED")){
          System.out.println("4");
        }else if(day.equals("THU")){
          System.out.println("3");
        }else if(day.equals("FRI")){
          System.out.println("2");
        }else if(day.equals("SAT")){
          System.out.println("1");
        }
      }
    }
}