//11
public class func{
public void createConnection(DbPoolConfig singleConfig){
      if(MyStringUtil.isBlank(singleConfig.getUser())){
        con = DriverManager.getConnection(singleConfig.getUrl());
      }else{
        con = DriverManager.getConnection(singleConfig.getUrl(), singleConfig.getUser(), singleConfig.getPassword());
      }
      System.out.println("è¿žæŽ¥æ± " + singleConfig.getName() + "åˆ›å»ºä¸€ä¸ªæ–°çš„è¿žæŽ¥");
      System.out.println("æ— æ³•åˆ›å»ºä¸‹åˆ—URLçš„è¿žæŽ¥: " + singleConfig.getUrl() + " user: " + singleConfig.getUser() + " pd: " + singleConfig.getPassword());
    return new Conn(con,singleConfig.getType());
}
}
