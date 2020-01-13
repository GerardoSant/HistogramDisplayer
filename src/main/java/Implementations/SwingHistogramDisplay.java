package Implementations;

import Model.Histogram;
import View.HistogramDisplay;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import javax.swing.*;
import java.awt.*;

public class SwingHistogramDisplay extends ApplicationFrame implements HistogramDisplay {

    Histogram histogram;

    public SwingHistogramDisplay(Histogram histogram) {
        super("Histograma");
        this.histogram=histogram;
        setContentPane(createPanel());
        pack();
        setLocationRelativeTo(null);
    }

    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel(){
        JPanel panel = new JPanel();
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(800,600));
        panel.add(chartPanel, BorderLayout.CENTER);
        return panel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart",
                "Dominions email","Nº de emails", dataset,
                PlotOrientation.VERTICAL,false,true,rootPaneCheckingEnabled);
        return chart;
    }



    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Object key : histogram){
            dataset.addValue(histogram.getCount(key), "",""+key);
        }
        return dataset;
    }

    @Override
    public void display() {
        execute();
    }
}
