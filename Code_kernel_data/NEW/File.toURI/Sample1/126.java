//125
public class func{
	public void testBundleWiringDTO(){
        File bf = createBundle(mf);
        Bundle bundle = framework.getBundleContext().installBundle(bf.toURI().toURL().toExternalForm());
        bundle.start();
        assertEquals("Precondition", Bundle.ACTIVE, bundle.getState());
        BundleWiringDTO dto = bundle.adapt(BundleWiringDTO.class);
        assertEquals(bundle.getBundleId(), dto.bundle);
}
}
