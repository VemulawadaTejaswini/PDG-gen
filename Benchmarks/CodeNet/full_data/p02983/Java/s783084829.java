import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    long l, r;
	
    l = sc.nextLong();
    r = sc.nextLong();

    boolean f1 = false;
    long min = (l*r)%2019;

    if(min == 0)
    {
        System.out.println(0);
        f1 = true;
    }
    
    long tmp;
    boolean f2 = false;
    if(f1 == false){
        if(l >= 2019){
            for(int i = 1; i<r-l+1; i++)
            {  
                tmp = (l+i)%2019;
                if(tmp==0){
                    System.out.println(0);
                    f2 = true;
                    break;
                }
                else if(min > tmp){
                    min = tmp;
                }
            }
        }
        else{
            for(int i = 0; i<r-l; i++){
                for(int j = 1; j < r-l+1; j++){
                    tmp = ((l+i)*(l+j))%2019;
                    if(tmp==0){
                        System.out.println(0);
                        f2 = true;
                        break;
                    }
                    else if(min > tmp){
                        min = tmp;
                    }
                }
            }
        }
    }
    if(f1 == false && f2 == false){
        System.out.println(min);
    }
    
  }
}