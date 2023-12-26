public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String t,h;
        int score_t=0;
        int score_h=0;
        for(int i=0; i<n; i++){
            t = sc.next();
            h = sc.next();
            if(t.compareTo(h) == 0){
                score_t += 1;
                score_h += 1;
            }
            else if(t.compareTo(h) > 0){
                score_t += 3;
            }
            else{
                score_h += 3;
            }
        }
        System.out.println(String.format("%d %d",score_t,score_h));
    }
}
