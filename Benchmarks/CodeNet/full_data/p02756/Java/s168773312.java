import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> s = new ArrayList<>();
        s.add(sc.next());
        Integer q = sc.nextInt();
        for(int i=0;i<q;i++){
            Integer t = sc.nextInt();
            if(t==1){// 反転
                Collections.reverse(s);
            }
            else{// 追加
                Integer f = sc.nextInt();
                String c = sc.next();
                if(f==1){// 先頭にc
                    s.add(0, c);
                }
                else{// 末尾にc
                    s.add(c);
                }
            }
        }

        for(String tmp : s){
            System.out.print(tmp);
        }

    }
}
