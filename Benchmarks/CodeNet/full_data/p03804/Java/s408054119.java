import java.io.*;

public class Main{
        public static void main(String[] args){
                BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
                int m,n;
                int checkn = (int)' ';
                String str;
                String[] s = new String[2];

                try{
                        str = r.readLine();
                        s[0] = str.substring(0,str.indexOf(checkn));
                        s[1] = str.substring(str.indexOf(checkn)+1,str.length());
                }catch(IOException e){
                        System.out.println(e);
                }

                n = Integer.parseInt(s[0]);
                m = Integer.parseInt(s[1]);

                String[] str_n = new String[n];
                String[] str_m = new String[m];
                int checkn2;

                try{
                        for(int i = 0;i < n;i++){
                                str_n[i] = r.readLine();
                        }
                        for(int i = 0;i < m;i++){
                                str_m[i] = r.readLine();
                        }
                }catch(IOException e){
                        System.out.println(e);
                }

                for(int i = 0;i < n+1-m;i++){
                        checkn2 = str_n[i].indexOf(str_m[0]);
                        if(checkn2 >= 0){
                                if(checkImage(str_n,str_m,checkn2,i) > 0){
                                        System.out.println("Yes");
                                        System.exit(-1);
                                }
                        }
                }

                System.out.println("No");
        }

        public static int checkImage(String[] str_n,String[] str_m,int checkn2,int i){
                for(int j = 1;j < str_m[0].length();j++){
                        if(str_m[0].length() == 1){
                                return 1;
                        }else{
                                if(str_n[i+j].substring(checkn2,checkn2+str_m[0].length()).matches(str_m[j])){
                                        return 1;
                                }
                        }
                }
                return 0;
        }
}
