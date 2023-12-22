import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");
        int sx=Integer.parseInt(str[0]);
        int sy=Integer.parseInt(str[1]);
        
        int tx=Integer.parseInt(str[2]);
        int ty=Integer.parseInt(str[3]);
        
        StringBuilder sb=new StringBuilder();
        
        if(sx>0){
            tx-=sx;
        }else if(sx<0){
            tx+=Math.abs(sx);
        }
        sx=0;
        
        if(sy>0){
            ty-=sy;
        }else if(sy<0){
            ty+=Math.abs(sy);
        }
        sy=0;
        
        for(int i=0;i<ty;i++){
            sb.append("U");
        }
        
        for(int i=0;i<tx;i++){
            sb.append("R");
        }
        
         for(int i=0;i<ty;i++){
            sb.append("D");
        }
        
        for(int i=0;i<tx;i++){
            sb.append("L");
        }
        
        sb.append("L");
        
        for(int i=0;i<=ty;i++){
            sb.append("U");
        }
        
          for(int i=0;i<=tx;i++){
            sb.append("R");
        }
        
        sb.append("DR");
        
          for(int i=0;i<=ty;i++){
            sb.append("D");
        }
        
          for(int i=0;i<=tx;i++){
            sb.append("L");
        }
        sb.append("U\n");
        
        System.out.println(sb);
    }
}
