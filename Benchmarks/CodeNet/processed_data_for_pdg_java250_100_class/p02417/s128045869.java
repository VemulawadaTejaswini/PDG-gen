public class Main{      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] charCount = new int[26];
        while(sc.hasNext()){
            String str=sc.next();
            if(str.isEmpty())
                break;
            char[] chars = str.toCharArray();
            for(int i=0;i<chars.length;i++){
                if('A' <= chars[i]&&chars[i] <= 'Z')
                    chars[i]=Character.toLowerCase(chars[i]);
                if('a' <= chars[i]&&chars[i] <= 'z')
                    charCount[chars[i]-'a']++;
            }
        }
        sc.close();
        char L00 = 'a';
        for (int L01 = 0; L01 <= ('z' - 'a'); L01++) {
            System.out.println(L00++ + " : "+charCount[L01]);
        }
    }   
}
