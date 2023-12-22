import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        boolean po[][]=new boolean[h][w];
        ArrayList<int[]>oder=new ArrayList<>();
        for(int i=0;i<h;i++){
            String s[]=sc.next().split("",0);
            for(int j=0;j<w;j++){
                po[i][j]=s[j].equals("#");
                if(s[j].equals("#"))oder.add(new int[]{j,i});
            }
        }
        
        boolean b=false;
        int count=0;
        oder.add(new int[]{-1,-1});
        while(oder.size()!=1){
            int[]o=oder.get(0);
            oder.remove(0);
            if(o[0]==-1&&o[1]==-1){
                if(!b)break;
                b=false;
                count++;
                oder.add(new int[]{-1,-1});
            }   
            else{
                if(o[0]!=w-1){
                    if(!po[o[1]][o[0]+1]){
                        oder.add(new int[]{o[0]+1,o[1]});
                        po[o[1]][o[0]+1]=true;
                        b=true;
                    }
                }
                if(o[0]!=0){
                    if(!po[o[1]][o[0]-1]){
                        oder.add(new int[]{o[0]-1,o[1]});
                        po[o[1]][o[0]-1]=true;
                        b=true;
                    }
                }
                if(o[1]!=h-1){
                    if(!po[o[1]+1][o[0]]){
                        oder.add(new int[]{o[0],o[1]+1});
                        po[o[1]+1][o[0]]=true;
                        b=true;
                    }
                }
                if(o[1]!=0){
                    if(!po[o[1]-1][o[0]]){
                        oder.add(new int[]{o[0],o[1]-1});
                        po[o[1]-1][o[0]]=true;
                        b=true;
                    }
                }
                
            }
        }
        System.out.println(count);
    }
}
