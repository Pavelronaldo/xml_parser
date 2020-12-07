package Entity;

public class Certificate {
    private String organization;
    private String date;
    private int id;


    public Certificate(String organization, String date, int id) {
        this.organization = organization;
        this.date = date;
        this.id = id;
    }

    public Certificate() {
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "organization='" + organization + '\'' +
                ", date='" + date + '\'' +
                ", id=" + id +
                '}';
    }
}
