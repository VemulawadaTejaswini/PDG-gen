//semicolon less Java
class Main{
    public static void main(String[] args){
        for(String[] str : new String[][]{{"CODEFESTIVAL2016",
            new java.util.Scanner(System.in).next()}}){

            for(int[] var : new int[][]{{0, 0}}){
                while(var[0] < str[0].length()){
                    if(str[0].charAt(var[0]) != str[1].charAt(var[0])){
                        if(var[1]++ > 0){}
                    }
                    if(var[0]++ > 0){}
                }
                if(System.out.printf("%d\n", var[1]) == null){}
            }
        }
    }
}