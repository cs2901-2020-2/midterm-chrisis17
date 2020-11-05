package cslab.makeImages;

import java.util.ArrayList;
import java.util.List;

public class PieChartMonitor {
    List<Integer> dates = new ArrayList<>();

    public void Update(List<Integer> data){
        dates.clear();
        dates = data;
    }

}
