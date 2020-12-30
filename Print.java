
package Body;


public class Print implements Printer {
    @Override
    public void print(int origArray[], int[] array, String type)  {
        System.out.print("Масив перед сортуванням: [ ");
        for( int i =0; i< array.length; i++) {
            System.out.print(origArray[i] + " ");
        }
        System.out.println("] ");
        
        System.out.print("Масив після сортування (" + type+ "): [ ");
        for( int i =0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("] ");
    }
}
