import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int index=sc.nextInt();
            if(!map.containsKey(index))
            map.put(index,1);
            else map.put(index,map.get(index)+1);
        }
        int indexmin=100000;
        for(Integer a:map.keySet()){
            indexmin=Math.min(map.get(a),indexmin);
        }
        boolean po=true;
        for(Integer a:map.keySet()){
            if(map.get(a)/indexmin*indexmin==map.get(a))
            map.put(a,map.get(a)/indexmin);
            else po=false;
        }
        if(po){
            ArrayList<Integer>aaa=new ArrayList<>();
            int kl=0;
            for(Integer a:map.keySet()){
                kl=a;
                for(int i=0;i<map.get(a);i++){
                    aaa.add(a);
                }
            }
            Collections.sort(aaa);
            if(aaa.size()==1){
                if(kl!=0)po=false;
            }
            else if(aaa.size()==2){
                if(aaa.get(0)==aaa.get(1)){
                }
                else{
                    po=false;
                }
            }
            else {for(int i=0;i<aaa.size()-2;i++){
                int k=aaa.get(i)^aaa.get(i+1);
                if(aaa.get(i+2)!=k){
                    po=false;
                    break;
                }
            }
            int k=aaa.get(0)^aaa.get(1);
            if(aaa.get(aaa.size()-1)!=k&&indexmin==1)po=false;
            }
        }
        System.out.println(po?"Yes":"No");
    }
}
