package cslab.makeImages;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Integer> dates = new ArrayList<>();
    BarChartMonitor barChar;
    PieChartMonitor pieChar;

    public void Update(){
        dates.clear();
        dates.add(40);
        dates.add(25);
        dates.add(15);
        dates.add(20);

        barChar.Update(dates);
        pieChar.Update(dates);
    }
}
