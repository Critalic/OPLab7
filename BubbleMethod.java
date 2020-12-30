package Body;

public class BubbleMethod implements Sorter {

    @Override
    public String sort(int[] array) {
        
        for (int i = 1; i < array.length; i++) {
            for (int b = (array.length - 1); b >= i; b--) {
                if (array[b - 1] > array[b]) {
                    int t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }

            }
        }
        String type = "Bubble";
        return type;

    }
}
