public class Main{
  public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strNyuryoku=br.readLine();
        String[] Syuturyoku=strNyuryoku.split(" ");
         Arrays.sort(Syuturyoku);
        int iSyou=Integer.parseInt(Syuturyoku[0]);
        int iTyu=Integer.parseInt(Syuturyoku[1]);
        int iDai=Integer.parseInt(Syuturyoku[2]);
        System.out.println(iSyou +" "+ iTyu +" "+ iDai);
    }
}
