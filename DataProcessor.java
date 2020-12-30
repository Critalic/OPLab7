package Body;

public class DataProcessor {

    private Sorter sorter;
    private Printer printer;

    public DataProcessor(Sorter sorter, Printer printer) {
        this.sorter = sorter;
        this.printer = printer;

    }

    public void arrayManager(int[] array) {
        int arrayOrig[] = new int[array.length];
        System.arraycopy(array, 0, arrayOrig, 0, (arrayOrig.length-1));
        String type =  sorter.sort(array);
        printer.print(arrayOrig, array,type );
    }

}
