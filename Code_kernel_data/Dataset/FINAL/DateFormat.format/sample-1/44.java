public class func{
public void writeBuySell(CSVPrinter printer,PortfolioTransaction transaction,String type,DateFormat dateFormat){
        printer.print(dateFormat.format(transaction.getDate()));
        printer.print(CSVExporter.escapeNull(transaction.getSecurity().getIsin()));
        printer.print(CSVExporter.escapeNull(transaction.getSecurity().getName()));
        printer.print(type);
        printer.print(Values.Amount.format(transaction.getActualPurchasePrice()));
        printer.print(Values.Share.format(transaction.getShares()));
        printer.print(Values.Amount.format(transaction.getFees()));
        printer.print(Values.Amount.format(transaction.getTaxes()));
        printer.println();
}
}
