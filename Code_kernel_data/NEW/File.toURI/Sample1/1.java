//0
public class func{
	public void testDuplicate(){
        assertTrue(CatalogUtilities.getRedirect(URI.create(PIZZA_NS), catalog) == null);
        URI duplicateRedirect = CatalogUtilities.getRedirect(URI.create(CatalogEntryManager.DUPLICATE_SCHEME + PIZZA_NS), catalog);
        assertTrue(duplicateRedirect.equals(new File(TEST_DIR, PIZZA_FILE).toURI()) || duplicateRedirect.equals(new File(TEST_DIR, AMINO_ACID_FILE).toURI()));
}
}
