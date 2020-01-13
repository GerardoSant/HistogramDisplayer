package Model;

public class Mail {
    private String domain;

    public Mail(String domain) {
        this.domain = domain;
    }

    public static boolean isMail(String line) {
        return line.matches("^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$");
    }
    public String getDomain() {
        return domain;
    }
}
