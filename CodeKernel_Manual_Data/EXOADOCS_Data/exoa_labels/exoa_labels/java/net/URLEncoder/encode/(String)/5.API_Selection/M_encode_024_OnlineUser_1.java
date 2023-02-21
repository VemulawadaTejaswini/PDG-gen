public class A{
	public Protocol getProtocol() {
		Protocol protocol = ProtocolConstant.getProtocol();
		protocol.put(String.valueOf(com.crack.ProtocolConstant.UID), java.net.URLEncoder.encode(name));
		protocol.put(String.valueOf(com.crack.ProtocolConstant.UNICK), java.net.URLEncoder.encode(nickname));
		protocol.put(String.valueOf(com.crack.ProtocolConstant.UAREA), java.net.URLEncoder.encode(area));
		protocol.put(String.valueOf(com.crack.ProtocolConstant.UCOMMUNITY), java.net.URLEncoder.encode(community));
		protocol.put(String.valueOf(com.crack.ProtocolConstant.UPAGE), java.net.URLEncoder.encode(page));
		protocol.put(String.valueOf(com.crack.ProtocolConstant.URL), java.net.URLEncoder.encode(url));
		protocol.put(String.valueOf(com.crack.ProtocolConstant.UTIME), String.valueOf(starting));
		return protocol;
		
	}
}