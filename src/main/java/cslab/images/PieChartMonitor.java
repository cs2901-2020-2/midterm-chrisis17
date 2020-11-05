package cslab.images;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PieChartMonitor {
    PieImage pieImage;
    List<Integer> dates = new ArrayList<>();

    public void UpdateData(List<Integer> data) throws IOException {
        dates.clear();
        dates = data;
        pieImage.MakeImage(dates);
    }

}
