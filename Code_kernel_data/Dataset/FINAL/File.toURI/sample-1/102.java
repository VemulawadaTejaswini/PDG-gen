public class func{
public void initializeCatalog(File folder,XMLCatalog catalog){
        URI relativeFolderUri = CatalogUtilities.relativize(folder.toURI(), catalog);
        ge = FolderGroupManager.createGroupEntry(relativeFolderUri, true, autoUpdate, catalog);
        catalog.addEntry(ge);
        update(ge);
}
}
