import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        int cnt = 0;
        int max = 0;
        
        for(int i=0; i<N; i++){
            str[i] = sc.next();
        }
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        ArrayList list = new ArrayList();
        for(String key: str){
            if(!list.contains(key))list.add(key);
            if(map.get(key) == null ){
                map.put(key,new Integer(1));
            }else{
                map.put(key,new Integer((int)map.get(key)+1));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            //StringBuffer a = new StringBuffer();
            //a.append(list.get(i));
            //a.append(" ");
            //a.append(map.get(list.get(i)));
            int b = (int)map.get(list.get(i));
            if(max<b){
                max = b;
                //System.out.println("max"+max);
            }
            //System.out.println(b);
        }
        for(int i=0; i<list.size(); i++){
            int b = (int)map.get(list.get(i));
            if(max==b){
                cnt++;
                //System.out.println("cnt"+cnt);
            }
        }
        String[] str2 = new String[cnt];
        int cnt2 = 0;
        for(int i=0; i<list.size(); i++){
            int b = (int)map.get(list.get(i));
            if(max==b){
                str2[cnt2] = (String)list.get(i);
                //System.out.println("cnt2"+cnt2+":"+str2[cnt2]);
                if(cnt2<cnt-1){
                    cnt2++;
                }
            }
        }
        Arrays.sort(str2);
        for(int i=0; i<cnt; i++){
            System.out.println(str2[i]);
        }
    }
}