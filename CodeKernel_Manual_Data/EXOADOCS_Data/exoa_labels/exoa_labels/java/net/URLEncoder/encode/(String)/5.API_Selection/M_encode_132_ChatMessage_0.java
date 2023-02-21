public class A{
	public String toString() {
		return new String(_type)+ProtocolConstant.TOKEN+java.net.URLEncoder.encode(msg)+ProtocolConstant.TOKEN+_color.getRGB();
	}
}