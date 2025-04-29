// SpreadsheetDocument.java
public class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    public void setDetails(String name, int rows, int cols) {
        this.spreadsheetName = name;
        this.rowCount = rows;
        this.columnCount = cols;
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
        System.out.println("Type: Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }

    @Override
    public Document clone() {
        SpreadsheetDocument clone = new SpreadsheetDocument();
        clone.setDetails(this.spreadsheetName, this.rowCount, this.columnCount);
        return clone;
    }
}
