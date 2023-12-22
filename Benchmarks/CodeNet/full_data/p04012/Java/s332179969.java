        import java.io.*;
        import java.util.*;
        public class Main{
          public static void main(String[] args) throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            int[] rec = new int[26];
            for(int i = 0;i<s.length();i++){
                rec[s.charAt(i)-'a'] += 1;
            }
            System.out.println(solve(rec));
              
          }
            public static String solve(int[] list){
                int i = 0;
                while(i<list.length){
                    if(list[i]%2!=0) return "No";
                    i++;
                }
                return "Yes";
            }
        }