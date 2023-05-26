//203
public class func{
public void testShadowed(){
        OntologyCatalogManager catalogManager = new OntologyCatalogManager(Collections.singletonList(new FolderGroupManager()));
        XMLCatalog catalog = catalogManager.ensureCatalogExists(TEST_DIR);
        assertTrue(CatalogUtilities.getRedirect(URI.create(AMINO_ACID_NS), catalog).equals(new File(TEST_DIR, AMINO_ACID_FILE).toURI()));     
}
}
