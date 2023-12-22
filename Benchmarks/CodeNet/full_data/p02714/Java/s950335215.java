import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        List<Integer> r = new ArrayList<>();
        List<Integer> g = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'R'){
                r.add(i);
            }else if(s.charAt(i) == 'G'){
                g.add(i);
            }else{
                b.add(i);
            }
        }
        int ans = 0;
        for(int i = 0; i < r.size(); i++){
            for(int j = 0; j < g.size(); j++){
                int x = r.get(i);
                int y = g.get(j);
                if(b.contains(Math.min(x,y) - Math.abs(x-y)) 
                || b.contains(Math.max(x,y) + Math.abs(x-y))
                || b.contains(Math.min(x,y) + Math.abs(x-y)/2)
                || b.contains(Math.max(x,y) - Math.abs(x-y)/2)){
                    ans++;
                }
            }
        }
        System.out.println(r.size() * g.size() * b.size() - ans);
    }
}

