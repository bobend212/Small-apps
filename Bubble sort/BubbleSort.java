
public class BubbleSort {

  // bubble sort logic
    public static void bubble_srt(int array[]) {
        int len = array.length;
        int k;
        for (int m = len; m >= 0; m--) {
            for (int i = 0; i < len - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


  public static void main(String[] args) {

        int[] input = {1000, 45, 1, 456, 12, 1, 4, 62, 14, 7, 32, 6, 89, 123};
        bubble_srt(input);
  }
}
