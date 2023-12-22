import java.util.*;

public class Main{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = Integer.parseInt(sc.next());

       //最初に出てくるSについて、keyを小文字アルファベット valueを回数
       Map<String, Integer> map = new TreeMap<>();

       //Sで文字列を受け取り、sに分割
       String S = sc.next();
       String[] s = S.split("");
       for(int i=0; i<s.length; i++) {
           if(map.containsKey(s[i])) {
               map.put(s[i], map.get(s[i])+1);
           }else {
               map.put(s[i], 1);
           }
       }

       //2番目以降に出てくるSについて、keyを小文字アルファベット valueを回数
       Map<String, Integer> mmap = new TreeMap<>();

       //最初のSに出てきたが、2番目以降のSには出てこなかった小文字アルファベットを格納
       ArrayList<String> delete = new ArrayList<>();
       
       for(int x=1; x<n; x++) {
           S = sc.next();
           s = S.split("");
           mmap = new HashMap<>();
           for(int i=0; i<s.length; i++) {
               if(mmap.containsKey(s[i])) {
                   mmap.put(s[i], mmap.get(s[i])+1);
               }else {
                   mmap.put(s[i], 1);
               }
           }
           
           
           for(String key : map.keySet()) {
               if(mmap.containsKey(key)) {

                   //mmapにもmapにもある=>共通なので頻出回数が少ない方の値を入れる
                   map.put(key, Math.min(map.get(key), mmap.get(key)));
               }else {

                   //mapにあってmmapにない=>共通ではないのでmapから削除するためdeleteに入れる
                   delete.add(key);
               }
           }
       }
       
       //deleteの中身を取り出してmapから削除
       if(delete.size() > 0) {
           for(String str : delete) {
               map.remove(str);
           }
       }
       
       String ans = "";

       //mapの中身を取り出してvalueの回数だけ追加
       for(String key : map.keySet()) {
           for(int i=0; i<map.get(key); i++) {
               ans += key;
           }
       }
       System.out.println(ans);
   }
}