// DocumentRegistry.java
public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public PdfDocument createPdf(String fileName, String author, int pageCount, String name) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.setDetails(fileName, author, pageCount, name);
        return doc;
    }

    public TextDocument createText(String path, String encoding, int words) {
        TextDocument doc = (TextDocument) textPrototype.clone();
        doc.setDetails(path, encoding, words);
        return doc;
    }

    public SpreadsheetDocument createSpreadsheet(String name, int rows, int cols) {
        SpreadsheetDocument doc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        doc.setDetails(name, rows, cols);
        return doc;
    }
}
