package Builder;

public enum States {
    Empty("empty"),
    Medicine("medicine"),
    Name("name"),
    Group("group"),
    Pharm("pharm"),
    Certificate("certificate"),
    ID("id"),
    Organization("organization"),
    Date("date"),
    Package("package"),
    Price("price"),
    PackageType("packageType"),
    Count("count"),
    Version("version");


    private String type;

    States(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
