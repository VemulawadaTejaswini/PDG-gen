public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sunukeNum = sc.nextInt();
        int sweetsNum = sc.nextInt();
        List<Integer> hasSweetsSunuke = new ArrayList<>();
        for(int i = 0; i < sunukeNum; i++){
            hasSweetsSunuke.add(0);
        }
        int trickNum = sunukeNum;
        for(int i = 0; i < sweetsNum; i++){
            int sweetsNo = sc.nextInt();
            for(int j = 0; j < sweetsNo; j++){
                int sunukeNo = sc.nextInt()-1;
                if(hasSweetsSunuke.get(sunukeNo) == 0){
                    hasSweetsSunuke.set(sunukeNo, 1);
                    trickNum--;
                }
            }
            if(trickNum == 0){
                System.out.println(0);
                return;
            }
        }
        System.out.println(trickNum);
    }
}
