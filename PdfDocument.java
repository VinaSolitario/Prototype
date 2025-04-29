// PdfDocument.java
public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;
    private String name;

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    public void setDetails(String fileName, String author, int pageCount, String name) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
    }

    @Override
    public String getType() {
        return "PDF";
    }

    @Override
    public Document clone() {
        PdfDocument clone = new PdfDocument();
        clone.setDetails(this.fileName, this.author, this.pageCount, this.name);
        return clone;
    }
}
