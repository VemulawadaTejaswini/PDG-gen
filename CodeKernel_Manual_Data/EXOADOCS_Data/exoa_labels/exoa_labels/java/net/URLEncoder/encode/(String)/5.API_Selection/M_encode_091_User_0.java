public class A{
	public String toString() {
		long o=System.currentTimeMillis()-starting;
		return java.net.URLEncoder.encode(name)+ProtocolConstant.SPACE+java.net.URLEncoder.encode(nickname)+ProtocolConstant.SPACE+state+ProtocolConstant.SPACE+o;
	}
}