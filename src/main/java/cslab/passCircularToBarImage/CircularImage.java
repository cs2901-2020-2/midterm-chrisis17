package cslab.passCircularToBarImage;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.util.List;

public class CircularImage {
    public void makeImage(List<Integer> dates) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int date : dates){
            dataset.setValue("A",date);
        }

        JFreeChart pieChart = ChartFactory.createPieChart("pie chart",dataset,true,true,false);

    }
}
