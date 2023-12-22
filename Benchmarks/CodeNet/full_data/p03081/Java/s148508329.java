import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] s = str.split(" ");
        int N = Integer.parseInt(s[0]);
        int Q = Integer.parseInt(s[1]);
        String str1 = "0" + br.readLine() + "0";
        String[][] td = new String[Q][2];
        for (int i=0;i<Q;i++){
            str = br.readLine();
            td[i] = str.split(" ");
        }
        System.out.println(B_search.b_search(N, str1, td, "R")-B_search.b_search(N, str1, td, "L"));
    }
}

class B_search{
    public static int b_search(int N,String str1,String[][] TD,String LR){
        int index = 0;
        int s = 0;
        int e = N+1;
        char c;
        String str;
        while (s!=e){
            index = (s+e)/2;
            for (int i=0;i<TD.length;i++){
                c = str1.charAt(index);
                str = String.valueOf(c);
                if (str.equals(TD[i][0])){
                    if (TD[i][1].equals("L")){
                        index--;
                    } else {
                        index++;
                    }
                }
                if (index<=0 || index>N){
                    break;
                }
            }
            if (LR.equals("L")){
                if (index<=0){
                    s = (s+e)/2+1;
                } else {
                    e = (s+e)/2;
                }
            } else {
                if (index>N){
                    e = (s+e)/2;
                } else {
                    s = (s+e)/2+1;
                }
            }
        }
        return s;
    }
}