package Body;

public class SelectionMethod implements Sorter {

    @Override
    public String sort(int[] array) {
       
        int inputLength = array.length;
        for (int i = 0; i < inputLength - 1; i++) {
            int min = i;
            for (int j = i + 1; j < inputLength; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        String type = "Selection";
        return type;
    }
}
