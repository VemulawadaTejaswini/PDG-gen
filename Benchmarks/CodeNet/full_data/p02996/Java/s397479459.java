import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Po>po=new ArrayList<>();
        for(int i=0;i<n;i++)po.add(new Po(sc.nextInt(),sc.nextInt()));
        Collections.sort(po,new Comparator<Po>(){
            public int compare(Po a,Po b){
                return a.b-b.b;
            }
        });
        long count=0;
        boolean b=true;
        for(int i=0;i<n;i++){
            Po p=po.get(i);
            count+=p.a;
            if(p.b<count){b=false;break;}
        }
        System.out.println((b)?"Yes":"No");
        
    }
    static class Po{
        int a,b;
        public Po(int a,int b){
            this.a=a;
            this.b=b;
        }
        public String toString(){
            return "a="+a+":b="+b;
        }
    }
}
