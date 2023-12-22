import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt(), w=sc.nextInt();
        char[][] c=new char[h][w];
        for(int i=0;i<h;i++) c[i]=sc.next().toCharArray();
        sc.close();
        int ex=4;
        int[][] sharp=new int[h+ex][w+ex];
        int[][] sharpT=new int[w+ex][h+ex];
        for(int i=0;i<h;i++){
            sharp[i][0]=-1;
            int index=1;
            for(int j=0;j<w;j++){
                if(c[i][j]=='#'){
                    sharp[i][index]=j;
                    index++;
                }
            }
            while(index<w+ex){
                sharp[i][index]=w;
                index++;
            }
        }
        for(int j=0;j<w;j++){
            sharpT[j][0]=-1;
            int index=1;
            for(int i=0;i<h;i++){
                if(c[i][j]=='#'){
                    sharpT[j][index]=i;
                    index++;
                }
            }
            while(index<h+ex){
                sharpT[j][index]=h;
                index++;
            }
        }
        // for(int i=0;i<h+2;i++){
        //     for(int j=0;j<w+2;j++){
        //         System.out.print(sharp[i][j]+" ");
        //     }
        //     System.out.print("\n");
        // }
        // for(int j=0;j<w+2;j++){
        //     for(int i=0;i<h+2;i++){
        //         System.out.print(sharpT[j][i]+" ");
        //     }
        //     System.out.print("\n");
        // }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(c[i][j]=='#') continue;
                int left=binarySearch(sharp[i], j);
                int top=binarySearch(sharpT[j], i);
                int row, column;
                
                //System.out.println("i,j:"+i+","+j/*+" r:"+row+" c:"+column*/);
                row=sharp[i][left+1]-sharp[i][left]-1;
                column=sharpT[j][top+1]-sharp[j][top]-1;
                max=Math.max(max, row+column-1);
            }
        }
        System.out.println(max);
    }
    public static boolean isOK(int[] array, int index, int key) {
        if (array[index]<key) return true;
        return false;
    }
    public static int binarySearch(int[] array, int key){
        int left=-1;
        int right=array.length;
        while(right-left>1){
            int mid=left+(right-left)/2;
            if(isOK(array, mid, key)) left=mid;
            else right=mid;
        }
        //if(right<array.length && isOK(array, right, key)) return right;
        return left;
    }
}