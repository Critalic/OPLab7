package Body;
public class MainClass {
    public static void main(String[] args) {
        int[] arrayUnSorted10000 = new int[10];
        for (int i = 0; i < arrayUnSorted10000.length; i++) {
            arrayUnSorted10000[i] = (int) (Math.random()*100);
        }

        

        DataProcessor process = new DataProcessor(new SelectionMethod() , new Print());
        process.arrayManager(arrayUnSorted10000);

    }
}
