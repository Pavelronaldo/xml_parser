package Entity;

public class Medicine implements Comparable<Medicine> {
    private String id;
    private String name;
    private Group group;
    private String pharm;
    private Certificate certificate;
    private Package aPackage;
    private Versions version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getPharm() {
        return pharm;
    }

    public void setPharm(String pharm) {
        this.pharm = pharm;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public Versions getVersion() {
        return version;
    }

    public void setVersion(Versions version) {
        this.version = version;
    }

    public Medicine() {
    }

    public Medicine(String name, Group group, String pharm, Certificate certificate, Package aPackage,
                    Versions version) {
        this.name = name;
        this.group = group;
        this.pharm = pharm;
        this.certificate = certificate;
        this.aPackage = aPackage;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", group=" + group +
                ", pharm='" + pharm + '\'' +
                ", certificate=" + certificate +
                ", aPackage=" + aPackage +
                ", version=" + version +
                "} \n";
    }


    @Override
    public int compareTo(Medicine o) {

        return (int) (this.aPackage.getPrice() - o.aPackage.getPrice());
    }
}
