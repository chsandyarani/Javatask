package Programs;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr = new int[] {4,3,5,6,1,2};
        int temp;
        Boolean flag;
        if (flag = false)
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = i + 1; j < arr.length; j++)
                {
                    if (arr[i] > arr[j])
                    {
                        temp = arr[i];
                        arr[i] =arr[j];
                        arr[j] = temp;
                    }
                }

            }
            System.out.println("Ascending order:" + Arrays.toString(arr));
        }
        else
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = i + 1; j < arr.length; j++)
                {
                    if (arr[i] < arr[j])
                    {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                    }
                }
            }
            System.out.println("Descending order:" + Arrays.toString(arr));
        }

    }
}