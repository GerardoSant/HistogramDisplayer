package Implementations;

import Model.Histogram;
import View.HistogramDisplay;

public class ConsoleHistogramDisplay implements HistogramDisplay {

    Histogram histogram;

    public ConsoleHistogramDisplay(Histogram histogram) {
        this.histogram = histogram;
    }

    @Override
    public void display() {
        for (Object value : histogram){
            System.out.println(value + " : " + histogram.getCount(value));
        }
    }
}
