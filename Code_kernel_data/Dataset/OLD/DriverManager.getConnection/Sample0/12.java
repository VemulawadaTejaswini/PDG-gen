//11
public class func{
	public void createConnection(DbPoolConfig singleConfig){
      if(MyStringUtil.isBlank(singleConfig.getUser())){
        con = DriverManager.getConnection(singleConfig.getUrl());
      }else{
        con = DriverManager.getConnection(singleConfig.getUrl(), singleConfig.getUser(), singleConfig.getPassword());
      }
      System.out.println("è��æ��æ��" + singleConfig.getName() + "å��å»�ä��ä��æ��ç��è��æ��");
      System.out.println("æ��æ��å��å»�ä��å��URLç��è��æ��: " + singleConfig.getUrl() + " user: " + singleConfig.getUser() + " pd: " + singleConfig.getPassword());
    return new Conn(con,singleConfig.getType());
}
}
