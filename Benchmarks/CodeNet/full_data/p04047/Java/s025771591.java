import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list=new ArrayList<>();
            int n=Integer.parseInt(br.readLine());
            String str=br.readLine();
            String[] ss=str.split(" ");
            for(int i=0;i<ss.length;i++){
                list.add(Integer.parseInt(ss[i]));
            }
            Collections.sort(list);
            int meals=0;
            for(int i=1;i<list.size();i+=2){
                meals+=Math.min(list.get(i),list.get(i-1));
            }
            System.out.println(meals);
        }catch(Exception e){

        }

    }

}
