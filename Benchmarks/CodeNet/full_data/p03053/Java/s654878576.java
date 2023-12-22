import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        boolean flg = false;
        int count = 0;
        
        String[][] Hline = new String[H][W];
        for(int i = 0; i < H; i++){
            String m = sc.next();
            String[] Wline = m.split("");
            Hline[i] = Wline;
        }
        
        
        while(checkleast(Hline)){
            List<Integer> Hlist = new ArrayList<>();
            List<Integer> Wlist = new ArrayList<>();
            for(int k = 0; k < Hline.length; k++){
                for(int l = 0; l < Hline[k].length; l++){
                    String target = Hline[k][l];
                        if(target.equals("#")){
                              Hlist.add(Integer.valueOf(k));
                              Wlist.add(Integer.valueOf(l));
                        }
                }
            }
           for(int ind = 0; ind < Hlist.size(); ind++){
              	int hl = (int)Hlist.get(ind);
                int wl = (int)Wlist.get(ind);
              	reverse(Hline,hl,wl);
            }
        count++;
        }
    
        System.out.println(count);
    }

    public static boolean checkleast(String[][] targetArray){
        boolean res = false;
        for(int n = 0; n < targetArray.length; n++){
            for(int o = 0; o < targetArray[n].length; o++){
                if(Arrays.asList(targetArray[n]).contains(".")){
                    res = true;    
                }
            }
        }
        return res;
    }
    
    public static void reverse(String[][] targetArray,int h, int w){
        //上
        if(h > 0){
        targetArray[h - 1][w] = "#";
        }
        //下
        if(h < targetArray.length - 1){
        targetArray[h + 1][w] = "#";
        }
        //右
        if(w < targetArray[h].length - 1){
        targetArray[h][w + 1] = "#";
        }
        //左
        if(w > 0){
        targetArray[h][w - 1] = "#";
        }
    }
}