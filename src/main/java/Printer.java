public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }
//
    public int getTotalPaper(){
        return sheets;
    }

    public int getToner(){
        return toner;
    }

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
        if (totalPages <= sheets) {
            sheets -= totalPages;
            toner -= totalPages;
        }
    }
}
