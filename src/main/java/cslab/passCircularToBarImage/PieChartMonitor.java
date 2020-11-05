package cslab.passCircularToBarImage;

import java.util.ArrayList;
import java.util.List;

public class PieChartMonitor {
    List<Integer> dates = new ArrayList<>();

    public void DataUpdate(List<Integer> data){
        dates.clear();
        dates = data;
    }

}
