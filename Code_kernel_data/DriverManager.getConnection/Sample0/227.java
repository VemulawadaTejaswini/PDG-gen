//226
public class func{
	public void creatConnection(){
      con = DriverManager.getConnection(url, userName, password); // ������»�����url��Ö��Լ���������������Ӳ���
      con.setAutoCommit(true); // ����ϵͳ���Զ����Ӳ���
}
}
