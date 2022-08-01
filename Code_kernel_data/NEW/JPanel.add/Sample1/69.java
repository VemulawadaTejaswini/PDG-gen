//68
public class func{
	public void adding="3" cellspacing="0" bgcolor="#ffffff">
Class230.createKeySigPanel(PGPPublicKey key)#0{
        Iterator<?> iter = key.getSignatures();
        while (iter.hasNext()) {
            PGPSignature sig = (PGPSignature)iter.next();
            String uid = "0x"+Long.toHexString(sig.getKeyID()).substring(8).toUpperCase();
            p.add(new JLabel(uid));
        }
}
}
