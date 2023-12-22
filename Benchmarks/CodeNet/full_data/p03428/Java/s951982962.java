import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    P[] ps=new P[n];
    P[] sps=new P[n];
    for(int i=0;i<n;i++){
      sps[i]=ps[i]=new P(sc.nextInt(),sc.nextInt());
    }
    //System.err.println("ps="+Arrays.toString(ps));
    
    boolean online=true;
    for(int i=2;i<n;i++){
      if(!online(ps[i-1],ps[i],ps[0])){
        online=false;break;
      }
    }
    if(online){
      int min=0,max=0;
      for(int i=1;i<n;i++){
        if(ps[min].y>ps[i].y||(ps[min].y==ps[i].y&&ps[min].x>ps[i].x)){
          min=i;
        }
        if(ps[max].y<ps[i].y||(ps[min].y==ps[i].y&&ps[max].x<ps[i].x)){
          max=i;
        }
      }
      for(int i=0;i<n;i++){
        System.out.println(i==min||i==max?0.5:0);
      }
      return;
    }
    
    List<P> svlist=new ArrayList<>();
    for(int i=0;i<n;i++){
      P ppp=ps[i];
      Arrays.sort(sps,(s1,s2)->P.hencom(s1,s2,ppp.x,ppp.y));
    //  System.err.println(i+" "+ps[i]+":"+Arrays.toString(sps));
      for(int j=1;j<n;j++){
        if(over(sps[j],sps[j+1==n?1:j+1],ppp)){
          ppp.live=true;
          break;
        }
      }
      if(ppp.live){svlist.add(ppp);}
    }
    int sumx=0;
    int sumy=0;
    for(P lp:svlist){
      sumx=sumx+lp.x;
      lp.x=lp.x*svlist.size();
      sumy=sumy+lp.y;
      lp.y=lp.y*svlist.size();
    }
    for(P lp:svlist){
      lp.x=(lp.x-sumx)*2;
      lp.y=(lp.y-sumy)*2;
    }
    Collections.sort(svlist,(s1,s2)->P.hencom(s1,s2,0,0));
    //System.err.println("svlist:"+svlist);
    svlist.add(svlist.get(0));
    //System.err.println("svlist:"+svlist);
    
    P[] bv=new P[svlist.size()-1+1];
    for(int i=0;i<svlist.size()-1;i++){
      bv[i]=P.sub(svlist.get(i+1),svlist.get(i));
    }
    //System.err.println("bv:"+Arrays.toString(bv));
    bv[bv.length-1]=bv[0];
    //System.err.println("bv:"+Arrays.toString(bv));
    for(int i=0;i<svlist.size()-1;i++){
      svlist.get(i+1).ans=aob(bv[i+1],bv[i])/2/Math.PI;
    }
    
    for(int i=0;i<n;i++){
      System.out.printf("%.17f\n",ps[i].ans);
    }
  }
  static class P{
    int x,y;
    boolean live=false;
    double ans=0;
    P(int x,int y){
      this.x=x;
      this.y=y;
    }
    public String toString(){
      return (live?"L":"D")+"("+x+","+y+")";
    }
    static P sub(P a,P b){
      return new P(a.x-b.x,a.y-b.y);
    }
    static int syo(int x,int y){
      if(x==0){
        if(y>0){return 2;
        }else if(y<0){return 6;
        }else{return -2;}
      }else if(y==0){
        if(x>0){return 0;
        }else if(x<0){return 4;}
      }
      if(x>0){
        if(y>0){return 1;
        }else{return 7;}
      }else{
        if(y>0){return 3;
        }else{return 5;}
      }
    }
    static int hencom(P s1,P s2,int cx,int cy){
      if(Integer.compare(
        syo(s1.x-cx,s1.y-cy),
        syo(s2.x-cx,s2.y-cy)
      )!=0){
        return Integer.compare(
          syo(s1.x-cx,s1.y-cy),
          syo(s2.x-cx,s2.y-cy)
        );
      }
      if(syo(s1.x-cx,s1.y-cy)%2==0){
        return 0;
      }
      return Long.compare(1L*(s2.x-cx)*(s1.y-cy),1L*(s1.x-cx)*(s2.y-cy));
    }
  }
  static double aob(P a,P b){
    double res=Math.atan2(a.y,a.x)-Math.atan2(b.y,b.x);
    res=res<0?res+Math.PI*2:res;
    return res;
  }
  static boolean over(P a,P b,P o){
    return over(a.x-o.x,a.y-o.y,b.x-o.x,b.y-o.y);
  }
  static boolean over(int ax,int ay,int bx,int by){
    //System.err.println("  OVER "+ax+","+ay+" "+bx+","+by+" "+(1L*ax*by-1L*bx*ay));
    return 1L*ax*by-1L*bx*ay<0;
  }
  static boolean online(P a,P b,P c){
    return online(a.x-c.x,a.y-c.y,b.x-c.x,b.y-c.y);
  }
  static boolean online(int ax,int ay,int bx,int by){
    return 1L*ax*by-1L*bx*ay==0;
  }
}