import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int[] a = new int[s.length()];
        
        char prev = ' ';
        int count = 0;
        int idx = -1;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == prev){
                count++;
            }else{
                if(prev == 'F'){
                    a[idx] = -count-1;
                }else if(prev == 'T'){
                    a[idx] = count+1;
                }
                count = 0;
                prev = c;
                idx++;
            }
        }
        if(prev == 'F'){
            a[idx] = -count-1;
        }else if(prev == 'T'){
            a[idx] = count+1;
        }
        
        ArrayList<Robo> b = new ArrayList<Robo>();
        b.add(new Robo(0,0,0));
        
        for(int i=0; a[i]!=0; i++){
            //System.out.println(a[i]);
            int t = a[i];
            if(t<0){
                t = -t;
                for(int j=0; j<b.size(); j++){
                    b.get(j).move(t);
                }
            }else{
                t %= 2;
                ArrayList<Robo> w = new ArrayList<Robo>();
                for(int j=0; j<b.size(); j++){
                    Robo r = b.get(j);
                    //System.out.println("  "+ (r.todi+t)%4 + " " + (r.todi+t+2)%4);
                    w.add(new Robo(r.tox, r.toy, (r.todi+t)%4));
                    w.add(new Robo(r.tox, r.toy, (r.todi+t+2)%4));
                }
                b = new ArrayList<>(new HashSet<>(w));
                //b = w;
            }
            
        }
        
        boolean f = false;
        for(int j=0; j<b.size(); j++){
            Robo r = b.get(j);
            //System.out.println(r.tox + " " + r.toy);
            if(r.tox==x && r.toy==y){
                f = true;
                break;
            }
        }
        
        System.out.println(f?"Yes":"No");
    }
    
    public static class Robo{
        int tox;
        int toy;
        int todi;
        
        int[] movy = {0, 1, 0, -1};
        int[] movx = {1, 0, -1, 0};
        
        public Robo(int tox, int toy, int todi){
            this.tox = tox;
            this.toy = toy;
            this.todi = todi;
        }
        
        public void move(int t){
            this.tox += movx[todi]*t;
            this.toy += movy[todi]*t;
        }
    }
}