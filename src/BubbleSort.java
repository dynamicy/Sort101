import java.util.Collections;
import java.util.List;

/**
 * Created by chris on 02/10/2016.
 */
public class BubbleSort implements Sort {
    @Override
    public List<Integer> sort(List<Integer> dataList) {
        for(int i = 0 ; i < dataList.size()-1 ; i++) {
            for(int j = 0 ; j < dataList.size()-i-1 ; j++) {
                if (dataList.get(j) > dataList.get(j+1)) /* For decreasing order use < */
                {
                    int temp = dataList.get(j);
                    dataList.set(j, dataList.get(j + 1));
                    dataList.set(j + 1, temp);
                }
            }
        }
        return dataList;
    }
}
