//152
public class func{
	public void testShadowed(){
        assertTrue(CatalogUtilities.getRedirect(URI.create(AMINO_ACID_NS), catalog).equals(new File(TEST_DIR, AMINO_ACID_FILE).toURI()));     
        assertTrue(CatalogUtilities.getRedirect(URI.create(CatalogEntryManager.SHADOWED_SCHEME + AMINO_ACID_NS), catalog).equals(new File(TEST_DIR, subDirectoryName + "/" + AMINO_ACID_FILE).toURI()));     
}
}
