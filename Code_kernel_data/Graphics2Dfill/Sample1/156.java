//155
public class func{
	public void replay(final WmfFile file){
    final MfLogRegion reg = file.getRegionObject( getRegion() );
    g2.fill( reg.getBounds() );
}
}
