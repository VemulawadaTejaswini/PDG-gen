import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        str = br.readLine();
        ArrayList<Long> A = new ArrayList<>();
        for (String s:str.split(" ")){
            A.add(Long.parseLong(s));
        }
        ArrayList<Long> cml = new ArrayList<>();
        cml.add((long)0);
        for (int i=0;i<N;i++){
            cml.add(cml.get(i)+A.get(i));
        }
        int cont = 0;
        for (int i=0;i<N;i++){
            for (int j=i+1;j<N+1;j++){
                if (cml.get(i)==cml.get(j)){
                    cont++;
                }
            }
        }
        System.out.println(cont);
    }
}