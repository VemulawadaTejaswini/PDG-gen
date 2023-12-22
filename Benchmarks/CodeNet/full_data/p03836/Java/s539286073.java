import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sx = Integer.parseInt(st.nextToken());
        int sy = Integer.parseInt(st.nextToken());
        int tx = Integer.parseInt(st.nextToken());
        int ty = Integer.parseInt(st.nextToken());

        String ans="";
        //first
        for(int i=0;i<Math.abs(ty-sy);i++){
            if(ty>=sy)
                ans+="U";
            else
                ans+="D";
        }
        for(int i=0;i<Math.abs(tx-sx);i++){
            if(tx>=sx)
                ans+="R";
            else
                ans+="L";
        }
        for(int i=0;i<Math.abs(ty-sy);i++){
            if(sy>=ty)
                ans+="U";
            else
                ans+="D";
        }
        for(int i=0;i<Math.abs(tx-sx);i++){
            if(sx>=tx)
                ans+="R";
            else
                ans+="L";
        }

        //second
        if(tx>=sx)
            ans+="L";
        else
            ans+="R";
        for(int i=0;i<Math.abs(ty-sy);i++){
            if(ty>=sy)
                ans+="U";
            else
                ans+="D";
        }
        if(ty>=sy)
            ans+="U";
        else
            ans+="D";

        for(int i=0;i<Math.abs(tx-sx);i++){
            if(tx>=sx)
                ans+="R";
            else
                ans+="L";
        }
        if(tx>=sx)
            ans+="R";
        else
            ans+="L";
        
        if(ty>=sy)
            ans+="D";
        else
            ans+="U";

        if(tx>=sx)
            ans+="R";
        else
            ans+="L";
        for(int i=0;i<Math.abs(ty-sy);i++){
            if(sy>=ty)
                ans+="U";
            else
                ans+="D";
        }
        if(sy>=ty)
            ans+="U";
        else
            ans+="D";

        for(int i=0;i<Math.abs(tx-sx);i++){
            if(sx>=tx)
                ans+="R";
            else
                ans+="L";
        }
        if(sx>=tx)
            ans+="R";
        else
            ans+="L";
        
        if(sy>=ty)
            ans+="D";
        else
            ans+="U";

        if(sx==tx && sy==ty)
            System.out.println("URDLDLUR");
        else
            System.out.println(ans);

    }

}
