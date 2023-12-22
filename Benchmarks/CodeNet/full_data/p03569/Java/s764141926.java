import java.util.Scanner;  
public class Main{  
    public static void main(String[] args){  
        Scanner scanner = new Scanner(System.in);  
        int f = scanner.nextInt();  
        scanner = new Scanner(System.in);  
        String str = new String;  
            str = scanner.nextLine();  
            System.out.println(str.length()-longest(str));  
    }  
    public static int longest(String str){  
        String rts = "";  
        int length = str.length();  
        int[][] ints = new int[length][length];  
        for(int i=length;i>0;i--){  
            rts+=str.substring(i-1,i);  
        }  
        for(int x=0;x<length;x++){  
            for(int y=0;y<length;y++){  
                String char1=str.substring(x,x+1);  
                String char2=rts.substring(y,y+1);  
                if (char1.equals(char2)){  
                    if(x!=0&y!=0){  
                        ints[x][y]=ints[x-1][y-1]+1;  
                    }else{  
                        ints[x][y]=1;  
                    }  
                }else{  
                    if(x==0&y==0){  
                        ints[x][y]=0;  
                    }else if(x == 0&y!=0){  
                        ints[x][y]=ints[x][y-1];  
                    }else if(y==0&x!=0){  
                        ints[x][y]=ints[x-1][y];  
                    }else{  
                        if(ints[x-1][y]>ints[x][y-1]){  
                            ints[x][y]=ints[x-1][y];  
                        }else{  
                            ints[x][y]=ints[x][y-1];  
                        }  
                    }  
                }  
            }  
        }  
        return ints[length-1][length-1];  
    }  
}