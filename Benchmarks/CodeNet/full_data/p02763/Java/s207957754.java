

import java.util.*;

class Order{
    int a,b,c;
}

class Main {

    static  int MM=100;
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        char[] ss=s.next().toCharArray();
        int q=s.nextInt();

        List<Order> querys=new ArrayList<>();

        HashMap<Integer,Set<Integer>> memory=new HashMap<>();

        for (int i = 0; i <q ; i++) {
            Order o=new Order();
            o.a=s.nextInt();
            o.b=s.nextInt();
            if(o.a==1){
                o.c=s.next().charAt(0);
            }else{
                o.c=s.nextInt();
            }
            querys.add(o);
        }
        // init moem

        for (int i = 0; i <ss.length ; i++) {
            int index=i/MM;
            Set ssss= memory.getOrDefault(index,new HashSet<>());
            ssss.add(ss[i]);
            memory.put(index,ssss);
        }


        for (int i = 0; i <q ; i++) {
            Order o=querys.get(i);
            if(o.a==1){
                int old=ss[o.b-1];
                ss[o.b-1]= (char) o.c;
                int index=o.b/MM;
                //System.out.println(ss);
                Set ssss= memory.getOrDefault(index,new HashSet<>());
                ssss.remove(old);
                ssss.add(o.c);
                memory.put(index,ssss);
            }else{
                int ret=0;
                boolean isMem=(o.b/MM)!=(o.c/MM);
                int start1=o.b;
                int end1=(o.b/MM+1)*MM-1;
                int start2=o.c/MM*MM;
                int end2=o.c;

                if(!isMem){
                    end1=end2;
                }

                ret+=count(start1,end1,ss);
                if (isMem){
                    ret+=count(start2,end2,ss);
                    for (int j = start1/MM+1; j <end2/MM ; j++) {
                        ret+=memory.get(j).size();
                    }
                }
                System.out.println(ret);
            }
        }
    }
    static int count(int s, int e, char[] ss){
        Set<Integer> buf=new HashSet<>();
        for (int j = s; j <=e ; j++) {
            buf.add((int) ss[j-1]);
        }
        return buf.size();
    }
}