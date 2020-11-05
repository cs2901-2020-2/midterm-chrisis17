package cslab.images;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BarChartMonitor {
    BarImage barImage;
    List<Integer> dates = new ArrayList<>();

    public void UpdateData(List<Integer> data) throws IOException {
        dates.clear();
        dates = data;
        barImage.MakeImage(dates);
    }

}
