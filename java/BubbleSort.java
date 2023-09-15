package java;
import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] array = { 6, 4, 5, 3, 1, 2 };
    print(Arrays.toString(array));
    for (int i = 0, len = array.length; i < len - 1; i++) {
      for (int j = 0; j < len - 1 - i; j++) {
        if (array[j] > array[j+1]) {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
    print(Arrays.toString(array));
  }

  private static void print(String string) {
    System.out.println(string);
  }
}