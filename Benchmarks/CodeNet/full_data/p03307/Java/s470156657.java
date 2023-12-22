import java.util.*;
import java.io.*;
class Main{
   public static void main(String[] args){
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
    long answer=0;
    if((n&1)==1){
     answer=n<<1;
    }else
     answer=n;
     out.write(answer+"");
}
}