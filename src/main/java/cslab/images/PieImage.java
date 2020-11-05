package cslab.images;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PieImage {
    public void DoImage(List<Integer> dates) throws IOException {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int date : dates){
            dataset.setValue("A",date);
        }

        JFreeChart pieChart = ChartFactory.createPieChart("pie chart",dataset,true,true,false);

        final PiePlot3D plot = ( PiePlot3D ) pieChart.getPlot( );
        plot.setStartAngle( 270 );
        plot.setForegroundAlpha( 0.60f );
        plot.setInteriorGap( 0.02 );
        File pieChartImage = new File( "PieChart.jpeg" );
        ChartUtilities.saveChartAsJPEG( pieChartImage , pieChart , 600 , 400 );
    }
}
