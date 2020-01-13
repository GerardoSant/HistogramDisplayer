package View;

import Model.Histogram;
import Model.Mail;

import java.util.List;

public class MailHistogramBuilder {
    public Histogram build(List<Mail> mails){
        Histogram histogram = new Histogram();
        for (Mail mail : mails){
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
