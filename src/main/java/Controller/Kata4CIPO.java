package Controller;

import Implementations.SwingHistogramDisplay;
import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;

import java.util.List;
import java.util.Scanner;

public class Kata4CIPO {
    public static void main(String[] args) {
        new Kata4CIPO().control();
    }

    List<Mail> mailList;
    HistogramDisplay display;
    Histogram histogram;

    private void control(){
        input();
        process();
        output();
    }

    private void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre del archivo .txt donde se encuentran los emails:");
        mailList= new MailListReader().read(scanner.next());
        scanner.close();
    }

    private void process() {
        MailHistogramBuilder builder = new MailHistogramBuilder();
        histogram = builder.build(mailList);
    }

    private void output() {
        System.out.println("Mostrando histograma...");
        display = new SwingHistogramDisplay(histogram);
        display.display();
    }

}
