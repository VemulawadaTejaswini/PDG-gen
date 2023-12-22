import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ボールの個数
        int board = sc.nextInt();
        String[][] boardData = new String[board][board];
        //各行、列の黒マス数
        int [][] blackCount = new int[2][board];

        for (int i=0; i<board; i++) {
            String line = sc.next();
            for (int j =0; j<board;j++) {
                boardData[i][j] = String.valueOf(line.charAt(j));
            }
        }
        blackCount[0] = boardDataRowCnt(board, boardData);

        int checkAvailable = 0;
        for (int i = 0; i < blackCount[0].length; i++) {
            checkAvailable += blackCount[0][i];
        }

        //すべてのマスが白の場合は黒への塗りつぶしが不可能
        if(checkAvailable == 0) {
            System.out.println("-1");
        }

        blackCount[1] = boardDataColCnt(board, boardData);

        int ans = getMinPath(board, blackCount, boardData);

        System.out.println(ans);
    }

    private static int[] boardDataRowCnt(int boardSize,String[][] strBoardData) {
        int[] blackCount = new int[boardSize];
        for (int i=0; i<boardSize; i++) {
            int rowCount = 0;
            for (int j =0; j<boardSize;j++) {
                if (strBoardData[i][j].equals("#")) {
                    rowCount++;
                }
            }
            blackCount[i] = rowCount;
        }
        return blackCount;
    }

    private static int[] boardDataColCnt(int boardSize,String[][] strBoardData) {
        int[] blackCount = new int[boardSize];
        for (int i=0; i<boardSize; i++) {
            int colCount = 0;
            for (int j =0; j<boardSize;j++) {
                if (strBoardData[j][i].equals("#")) {
                    colCount++;
                }
            }
            blackCount[i] = colCount;
        }
        return blackCount;
    }

    private static int getMinPath(int boardSize, int[][] boardData, String[][] strBoardData) {
        int minPathCount = 0;

        while(true) {
            boardData[0] = boardDataRowCnt(boardSize, strBoardData);
            boardData[1] = boardDataColCnt(boardSize, strBoardData);
            int rowNum = getMaxRow(boardSize, boardData);
            int colNum = getMinCol(boardSize, boardData);
            changeStatus(rowNum, colNum, strBoardData);
            minPathCount++;
            int cnt = 0;
            for (int i = 0; i < boardData[0].length; i++) {
                cnt += boardData[0][i];
            }
            if (cnt == Math.pow(boardSize, 2) ) {
                break;
            }
        }
        return minPathCount;
    }

    private static void changeStatus(int rowNum, int colNum, String[][] strBoardData) {
        for(int i = 0; i < strBoardData[0].length; i++) {
            strBoardData[i][colNum] = strBoardData[rowNum][i];
        }
    }

    private static int getMaxRow(int boardSize, int[][] boardData) {
        int maxNum = boardData[0][0];
        int retRowNum = 0;
        for(int i = 1;i < boardSize; i++) {
            if(maxNum > boardData[i][0]) {
                maxNum = boardData[i][0];
                retRowNum = i;
            }
        }
        return retRowNum;
    }

    private static int getMinCol(int boardSize, int[][] boardData) {
        int maxNum = boardData[0][1];
        int retColNum = 0;
        for(int i = 1;i < boardSize; i++) {
            if(maxNum > boardData[i][1]) {
                maxNum = boardData[i][1];
                retColNum = i;
            }
        }
        return retColNum;
    }
}


