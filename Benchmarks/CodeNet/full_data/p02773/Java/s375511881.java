import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        String s[] = new String [n];
        
        ArrayList<String> dir = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<>();
        s[0] = stdIn.next();
        dir.add(s[0]);
        count.add(1);
        for(int i = 1; i < n; i++){
          s[i] = stdIn.next();
          for(int j = 0; j < dir.size(); j++){
            if(s[i].compareTo(dir.get(j)) == 0) {count.add(j, count.get(j)+1); break;}
            if(s[i].compareTo(dir.get(j)) < 0 ){
              if(j == 0) {dir.add(0, s[i]); count.add(0, 1); break;}
              dir.add(j-1, s[i]);
              count.add(j-1, 1);
              break;
            }
            if(dir.size() - 1 == j) {dir.add(s[i]); count.add(1); break;}
          System.out.println("j = " + j +"Array" + count + dir);
          }
          System.out.println("i = " + i +"Array" + count + dir);
        }

        int maxCount = count.get(0);
        for(int i = 0; i < n; i++){
          if(maxCount != count.get(i)) break;
          System.out.println(dir.get(i));
        }
    }
}

