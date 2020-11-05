package cslab.passCircularToBarImage;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.List;

public class BarImage {
    public void MakeImage(List<Integer> dates){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int date : dates){
            dataset.setValue(date,"A","B");
        }

        JFreeChart barChart = ChartFactory.createBarChart("bar chart", "", "chart", dataset, PlotOrientation.VERTICAL,false,true,false);

    }

}
