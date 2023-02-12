public class func{
public void reloadBookModel(){
      data.put("name", info.getName());
      data.put("lastmodify", dateFormat.format(info.getLastModify()));
      data.put("bookinfo", info);
      bookListModel.add(data);
    bookList.setModel(bookListModel);
}
}
