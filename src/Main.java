import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chris on 02/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(4, 2, 1, 6, 5));

        for (int data : dataList) {
            System.out.print(data);
        }
        System.out.println();

        System.out.println("==============");
        BubbleSort bubbleSort = new BubbleSort();

        dataList = bubbleSort.sort(dataList);

        for (int data : dataList) {
            System.out.print(data);
        }
    }
}
