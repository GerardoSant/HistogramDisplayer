package Controller;
import Implementations.SwingHistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;

public class Kata4 {

    public static void main(String[] args) {
        SwingHistogramDisplay swingHistogramDisplay =
                new SwingHistogramDisplay(new MailHistogramBuilder().build(new MailListReader().read("mails.txt")));
        swingHistogramDisplay.display();
    }
}
