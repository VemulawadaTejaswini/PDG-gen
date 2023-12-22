import java.util.*;public class Main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            for(int k=0;k<2;k++){
                int y;
                if(i==0 && j==0 && k==0){
                    y= Integer.parseInt(s.charAt(0)+"")+Integer.parseInt(s.charAt(1)+"")+Integer.parseInt(s.charAt(2)+"")+Integer.parseInt(s.charAt(3)+"");
                    if(y==7){
                        System.out.println(Integer.parseInt(s.charAt(0)+"")+"+"+Integer.parseInt(s.charAt(1)+"")+"+"+Integer.parseInt(s.charAt(2)+"")+"+"+Integer.parseInt(s.charAt(3)+"")+"=7");
                        return;
                    }
                }
                if(i==0 && j==0 && k==1){
                    y= Integer.parseInt(s.charAt(0)+"")+Integer.parseInt(s.charAt(1)+"")+Integer.parseInt(s.charAt(2)+"")-Integer.parseInt(s.charAt(3)+"");
                    if(y==7){
                        System.out.println(Integer.parseInt(s.charAt(0)+"")+"+"+Integer.parseInt(s.charAt(1)+"")+"+"+Integer.parseInt(s.charAt(2)+"")+"-"+Integer.parseInt(s.charAt(3)+"")+"=7");
                        return;
                    }
                }
                if(i==0 && j==1 && k==0){
                    y= Integer.parseInt(s.charAt(0)+"")+Integer.parseInt(s.charAt(1)+"")-Integer.parseInt(s.charAt(2)+"")+Integer.parseInt(s.charAt(3)+"");
                    if(y==7){
                        System.out.println(Integer.parseInt(s.charAt(0)+"")+"+"+Integer.parseInt(s.charAt(1)+"")+"-"+Integer.parseInt(s.charAt(2)+"")+"+"+Integer.parseInt(s.charAt(3)+"")+"=7");
                        return;
                    }
                }
                if(i==0 && j==1 && k==1){
                    y= Integer.parseInt(s.charAt(0)+"")+Integer.parseInt(s.charAt(1)+"")-Integer.parseInt(s.charAt(2)+"")-Integer.parseInt(s.charAt(3)+"");
                    if(y==7){
                        System.out.println(Integer.parseInt(s.charAt(0)+"")+"+"+Integer.parseInt(s.charAt(1)+"")+"-"+Integer.parseInt(s.charAt(2)+"")+"-"+Integer.parseInt(s.charAt(3)+"")+"=7");
                        return;
                    }
                }
                if(i==1 && j==1 && k==0){
                    y= Integer.parseInt(s.charAt(0)+"")-Integer.parseInt(s.charAt(1)+"")-Integer.parseInt(s.charAt(2)+"")+Integer.parseInt(s.charAt(3)+"");
                    if(y==7){
                        System.out.println(Integer.parseInt(s.charAt(0)+"")+"-"+Integer.parseInt(s.charAt(1)+"")+"-"+Integer.parseInt(s.charAt(2)+"")+"+"+Integer.parseInt(s.charAt(3)+"")+"=7");
                        return;
                    }
                }
                if(i==1 && j==1 && k==1){
                    y= Integer.parseInt(s.charAt(0)+"")-Integer.parseInt(s.charAt(1)+"")-Integer.parseInt(s.charAt(2)+"")-Integer.parseInt(s.charAt(3)+"");
                    if(y==7){
                        System.out.println(Integer.parseInt(s.charAt(0)+"")+"-"+Integer.parseInt(s.charAt(1)+"")+"-"+Integer.parseInt(s.charAt(2)+"")+"-"+Integer.parseInt(s.charAt(3)+"")+"=7");
                        return;
                    }
                }
                if(i==1 && j==0 && k==0){
                    y= Integer.parseInt(s.charAt(0)+"")-Integer.parseInt(s.charAt(1)+"")+Integer.parseInt(s.charAt(2)+"")+Integer.parseInt(s.charAt(3)+"");
                    if(y==7){
                        System.out.println(Integer.parseInt(s.charAt(0)+"")+"-"+Integer.parseInt(s.charAt(1)+"")+"+"+Integer.parseInt(s.charAt(2)+"")+"+"+Integer.parseInt(s.charAt(3)+"")+"=7");
                        return;
                    }
                }
                if(i==1 && j==0 && k==1){
                    y= Integer.parseInt(s.charAt(0)+"")-Integer.parseInt(s.charAt(1)+"")+Integer.parseInt(s.charAt(2)+"")-Integer.parseInt(s.charAt(3)+"");
                    if(y==7){
                        System.out.println(Integer.parseInt(s.charAt(0)+"")+"-"+Integer.parseInt(s.charAt(1)+"")+"+"+Integer.parseInt(s.charAt(2)+"")+"-"+Integer.parseInt(s.charAt(3)+"")+"=7");
                        return;
                    }
                }
            }
        }
    }
    }
}
