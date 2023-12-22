import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=0,x=0,l=0;
        if(scan.hasNext())
            n=scan.nextInt();
        ArrayList<pair> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(scan.hasNext())
                x=scan.nextInt();
            if(scan.hasNext())
                l=scan.nextInt();
            list.add(new pair(x-l,x+l));
        }
        Collections.sort(list, new Comparator<pair>() {
            @Override
            public int compare(pair p1, pair p2) {
                if(p1.x>p2.x){
                    return 1;
                }else if(p1.x<p2.x){
                    return -1;
                }else{
                    if(p1.y>p2.y){
                        return 1;
                    }else if(p1.y<p2.y){
                        return -1;
                    }else{
                        return 0;
                    }
                }
            }
        });
        int i=1;
        while(i<list.size()){
            if(list.get(i).x>=list.get(i-1).y){
                i++;
            }else{
                if(list.get(i-1).y>=list.get(i).y){
                    list.remove(i-1);
                }else{
                    list.remove(i);
                }
            }
        }
        System.out.println(list.size());

    }
    static class pair{
        int x,y;
        public pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
