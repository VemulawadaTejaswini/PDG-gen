import java.util.*;

public class Main {
    static ArrayList<Long> l=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=Long.parseLong(sc.next());
        long po=n;
        long ans=0;
       Map<Long,Integer> map=new HashMap<>();
       
        for(long i=2;i*i<=n;i++){
            while(n%i==0){
                if(map.containsKey(new Long(i))){
                    map.put(i,map.get(i)+1);
                }
                else {
                    map.put(i,1);
                }
                n/=i;
            }
        }
        if(n!=1)map.put(n,1);
        long aa[]=new long[map.size()];
        int index=0;
        for(Long key:map.keySet()){
            aa[index++]=key;
            //System.out.println(aa[index-1]);
        }
        popo(map,aa,map.size()-1,1);
        
        
        /*int count=0;
        for(Long key:map.keySet()){
            System.out.println(key+" "+map.get(key));
            count+=map.get(key);
        }
        long[]array=new long[count];
        int index=0;
        for(Long key:map.keySet()){
            for(int i=0;i<map.get(key);i++){
                array[index++]=key;
            }
        }*/
        
        //for(int i=0;i<count;i++)System.out.println(array[i]);
        //System.out.println(count);
        Collections.sort(l);
        for(int i=0;i<l.size()/2;i++){
            long a=Long.parseLong(l.get(l.size()-1-i)+"")-1;
            //System.out.println(a);
            if(po%a==po/a)ans+=a;
        }
        System.out.println(ans);
    }
    public static void popo(Map map,long[]aa,int size,long value){
        if(size<0){
            //System.out.println(value);
            l.add(value);
        }
        else{
            for(int i=0;i<Integer.parseInt(map.get(aa[size])+"");i++){
            if(i==0){
                popo(map,aa,size-1,value);
            }
            popo(map,aa,size-1,value*aa[size]);
            value*=aa[size];
        }
        }
    }
}
