package katahistograma;

import java.awt.PopupMenu;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class ChartHistogramViewer<T> extends HistogramViewer<T> {

    public ChartHistogramViewer(Histogram<T> histogram) {
        super(histogram);
    }

    @Override
    public void show() {
        ApplicationFrame frame = new ApplicationFrame("Histogram");
        frame.add(createChartPannel());
        frame.pack();
        frame.setVisible(true);
    }

    private ChartPanel createChartPannel() {
        ChartPanel panel = new ChartPanel(createChart());
        return panel;
    }

    private JFreeChart createChart() {
        JFreeChart chart = ChartFactory.createBarChart("Histogram", "Category", "Frequency", createDataSet());
        return chart;
    }

    private CategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (T item : getHistogram().keySet()) {
            dataset.addValue(getHistogram().get(item), "Category", (String)item);
        }
        return dataset;
    }
    
}
