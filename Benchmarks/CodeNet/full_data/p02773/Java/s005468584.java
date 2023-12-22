import java.util.*;

class Main{
    static void sort(String[] s, int[] count){
      for(int i = 0; i < s.length; i++){
        for(int j = i+1; j < s.length; j++){
          if(count[i] < count[j]){
            int t = count[i];
            count[i] = count[j];
            count[j] = t;
            String u = s[i];
            s[i] = s[j];
            s[j] = u;
          }
          if(count[i] == count[j]){
          if (s[i].compareTo(s[j]) > 0) {
              int t = count[i];
              count[i] = count[j];
              count[j] = t;
              String u = s[i];
              s[i] = s[j];
              s[j] = u;
          }
          }
        }
      }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        String s[] = new String [n];
        int count[] = new int [n];
        for(int i = 0; i < n; i++){
          s[i] = stdIn.next();
          count[i] = 0;
          for(int j = 0; j <= i; j++){
            if(s[i].equals(s[j])) {count[i]++; break;}
          }
        }

       sort(s,count);
       int max = count[0];
       for(int i = 0; i < n; i++){
         if(max !=count[i]) break;
         System.out.println(s[i]);
       }
        
    }
}

