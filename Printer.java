public class Printer {

    private String queue = "";
    private int pagesCount = 0;
    private int documentCount = 0;
    private int allPagesCount = 0;
    private int allDocumentCount = 0;

    public static void main(String[] args) {
        Printer Xerox = new Printer();
        Xerox.append("text text text text");
        Xerox.append("123", "so many text", 3);
        Xerox.print();
        Xerox.append("One more text", "text text text text text", 2);
        Xerox.print();
    }
    
    public void append(String name, String text) {
        queue = queue + "\n -------------------------- \n" + name + "\n \n" + text;
        pagesCount++;
        documentCount++;
        allPagesCount++;
        allDocumentCount++;
    }

    public void append(String text) {
        queue = queue + "\n -------------------------- \n" + text;
        pagesCount++;
        documentCount++;
        allPagesCount++;
        allDocumentCount++;
    }

    public void append(String name, String text, int pages) {
        queue = queue + "\n -------------------------- \n" + name + "\n \n" + text + "\n \n" + "Pages count: " + pages;
        pagesCount = pagesCount + pages;
        documentCount++;
        allPagesCount = allPagesCount + pages;
        allDocumentCount++;
    }

    public void clear() {
        queue = "";
        pagesCount = 0;
        documentCount = 0;
    }

    public void print() {
        System.out.println(queue);
        System.out.println("\n -------------------------- \n" + "Количество документов: " + getDocumentCount() + "\n" + "Количество страниц: " + getPagesCount());
        System.out.println("Общее Количество документов: " + getAllDocumentCount() + "\n" + "Общее Количество страниц: " + getAllPagesCount());
        clear();
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getDocumentCount() {
        return documentCount;
    }

    public int getAllPagesCount() {
        return allPagesCount;
    }

    public int getAllDocumentCount() {
        return allDocumentCount;
    }
}
