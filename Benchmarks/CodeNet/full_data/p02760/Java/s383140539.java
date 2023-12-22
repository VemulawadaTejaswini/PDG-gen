public class Main {

    public static void main(String[] args) {
        int[][] board = new int[3][3];
        boolean[][] ans = new boolean[3][3];
        boolean flag = false;
        int i;
        for(i=0;i<3;i++){
            board[i] = getLineInts();
        }
        int[] searchObject = new int[getLineInts()[0]];
        for(i=0;i<searchObject.length;i++){
            searchObject[i] = getLineInts()[0];
        }

        int j,k,l;
        for(j=0;j<3;j++){
            for(k=0;k<3;k++){
               for(l=0;l<searchObject.length;l++){
                   int nowNum = board[j][k];
                   if(nowNum == searchObject[l]){
                       ans[j][k] = true;
                   }
               }
            }
        }
        for(j=0;j<3;j++){
            if((ans[j][0] == ans[j][1] == ans[j][2]) && ans[j][0]){
                flag = true;
            }
        }

        for(j=0;j<3;j++){
            if((ans[0][j] == ans[1][j] == ans[2][j]) && ans[2][j]){
                flag = true;
            }
        }

        System.out.println(flag ? "Yes":"No");


    }

    public static int[] getLineInts(){
        return java.util.stream.Stream.of(getLine()).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] getLine(){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        return scan.nextLine().split(" ");
    }
}
