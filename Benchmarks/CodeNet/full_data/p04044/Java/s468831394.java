import java.util.*;
class Main{
        public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
        int s = sc.nextInt();
        List<String> res = new ArrayList();

        for(int i = 0; i <= n; i++){
                res.add(sc.nextLine());
        }

        Collections.sort(res);
        StringBuffer ret = new StringBuffer();
        for(String a : res)
          ret.append(a);

        System.out.println(ret.toString());
    }
}