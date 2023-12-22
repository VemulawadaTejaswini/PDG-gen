import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int  n = sc.nextInt();
    List<Xy> l1 = new ArrayList<>();
    List<Xy> l2 = new ArrayList<>();
    List<Xy> l3 = new ArrayList<>();
    List<Xy> l4 = new ArrayList<>();
    int l1x=0;
    int l1y=0;
    int l2x=0;
    int l2y=0;
    int l3x=0;
    int l3y=0;
    int l4x=0;
    int l4y=0;
    int px=0;
    int py=0;
    int mx=0;
    int my=0;
    for(int i=0;i<n;i++){
      int x=sc.nextInt();
      int y=sc.nextInt();
      if(x>0){
        if(y>0){
          l1.add(new Xy(x,y));
        }else if(y<0){
          l4.add(new Xy(x,y));
        }else{
          px+=x;
        }
      }else if(x<0){
        if(y>0){
          l2.add(new Xy(x,y));
        }else if(y<0){
          l3.add(new Xy(x,y));
        }else{
          mx+=x;
        }
      }else{
        if(y>0){
          py+=y;
        }else{
//          System.out.println(i);
          my+=y;
        }
      }
    }
    double max=0;
    for(Xy xy:l1){
      l1x+=xy.x;
      l1y+=xy.y;
    }
    for(Xy xy:l2){
      l2x+=xy.x;
      l2y+=xy.y;
    }
    for(Xy xy:l3){
      l3x+=xy.x;
      l3y+=xy.y;
    }
    for(Xy xy:l4){
      l4x+=xy.x;
      l4y+=xy.y;
    }
    
    max=Math.max(Math.hypot(l1x+px,l1y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+mx,l2y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l3x+mx,l3y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l4x+px,l4y+my),max);//    System.out.println(max);
    
    max=Math.max(Math.hypot(l1x+px,l1y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+px,l2y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l3x+mx,l3y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l4x+mx,l4y+my),max);//    System.out.println(max);
    
    max=Math.max(Math.hypot(l1x+mx,l1y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+px,l2y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l3x+px,l3y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l4x+mx,l4y+py),max);//    System.out.println(max);
    
    max=Math.max(Math.hypot(l1x+mx,l1y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+mx,l2y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l3x+px,l3y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l4x+px,l4y+py),max);//    System.out.println(max);
    
    max=Math.max(Math.hypot(l1x+l4x+px,l1y+l4y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+px,l1y+l2y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+l3x+mx,l2y+l3y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l3x+l4x+px,l3y+l4y+my),max);
    
    max=Math.max(Math.hypot(l1x+l4x+px,l1y+l4y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+mx,l1y+l2y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+l3x+mx,l2y+l3y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l3x+l4x+mx,l3y+l4y+my),max);
    
    max=Math.max(Math.hypot(l1x+l4x+mx,l1y+l4y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+px,l1y+l2y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+l3x+px,l2y+l3y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l3x+l4x+mx,l3y+l4y+py),max);
    
    max=Math.max(Math.hypot(l1x+l4x+mx,l1y+l4y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+mx,l1y+l2y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+l3x+px,l2y+l3y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l3x+l4x+px,l3y+l4y+py),max);
    
    max=Math.max(Math.hypot(l1x+l3x+l4x+mx,l1y+l3y+l4y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+l4x+mx,l1y+l2y+l4y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+l3x+mx,l1y+l2y+l3y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+l3x+l4x+mx,l2y+l3y+l4y+my),max);
    
    max=Math.max(Math.hypot(l1x+l3x+l4x+mx,l1y+l3y+l4y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+l4x+mx,l1y+l2y+l4y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+l3x+mx,l1y+l2y+l3y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+l3x+l4x+mx,l2y+l3y+l4y+py),max);
    
    max=Math.max(Math.hypot(l1x+l3x+l4x+px,l1y+l3y+l4y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+l4x+px,l1y+l2y+l4y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+l3x+px,l1y+l2y+l3y+my),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+l3x+l4x+px,l2y+l3y+l4y+my),max);
    
    max=Math.max(Math.hypot(l1x+l3x+l4x+px,l1y+l3y+l4y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+l4x+px,l1y+l2y+l4y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l1x+l2x+l3x+px,l1y+l2y+l3y+py),max);//    System.out.println(max);
    max=Math.max(Math.hypot(l2x+l3x+l4x+px,l2y+l3y+l4y+py),max);

    
    System.out.println(max);
  }
  static class Xy{
    int x;
    int y;
    Xy(int x,int y){
      this.x=x;
      this.y=y;
    }
  }
}
