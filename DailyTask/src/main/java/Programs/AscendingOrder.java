package Programs;

import java.util.Arrays;

public class AscendingOrder {

    public static  void ascending(int[] array,boolean flag)
    {
        int temp;
        if (flag ) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }

            }
            System.out.println("Ascending order:" + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 3, 5, 6, 1, 2};
        boolean b = true;
        ascending( array ,b);
    }

    }
