//142
public class func{
	public void setUpCubeConn(){
        cubeConnection = DriverManager.getConnection("jdbc:calcite:model=" + olapTmp.getAbsolutePath(), props);
}
}
