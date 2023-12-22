import java.util.Scanner;

public class Main {
    Scanner in;
    int lineNum;
    int colNum;
    char[][] array;
    String temp;
    int[][] direction1={{-1,-1},{1,-1},{-1,1},{1,1}};
    int[][] direction2={{0,1},{1,0},{-1,0},{0,-1}};

    Main(){
        in=new Scanner(System.in);

        lineNum=in.nextInt();
        colNum=in.nextInt();

        array=new char[lineNum][colNum];

        for(int i=0;i<lineNum;i++){
            temp=in.next();
            for(int j=0;j<colNum;j++){
                array[i][j]=temp.charAt(j);
            }
        }
    }

    public void cal(){
        char[][] result=new char[lineNum][colNum];
        int xtemp=0;
        int ytemp=0;
        int count=0;

        for(int i=0;i<lineNum;i++){
            for(int j=0;j<colNum;j++){
                if(array[i][j]=='#'){
                    result[i][j]='#';
                }
                else{
                    for(int[] k:direction1){
                        xtemp=i+k[0];
                        ytemp=j+k[1];

                        if(xtemp<0 || ytemp<0 || xtemp>=lineNum || ytemp>=colNum){
                            continue;
                        }
                        else if(array[xtemp][ytemp]=='#'){
                            count++;
                        }
                    }

                    for(int[] l:direction2){
                        xtemp=i+l[0];
                        ytemp=j+l[1];

                        if(xtemp<0 || ytemp<0 || xtemp>=lineNum || ytemp>=colNum){
                            continue;
                        }
                        else if(array[xtemp][ytemp]=='#'){
                            count++;
                        }
                    }

                    array[i][j]=(char)(count+48);
                    count=0;
                }
            }
        }

        for(int i=0;i<lineNum;i++){
            for(int j=0;j<colNum;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Main m=new Main();
        m.cal();
    }
}
