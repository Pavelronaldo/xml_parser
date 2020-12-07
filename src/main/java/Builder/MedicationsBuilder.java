package Builder;

import Entity.*;
import Entity.Package;

public class MedicationsBuilder implements Builder<Medications> {

    private States state = States.Empty;

    private Medications medications = new Medications();
    private Medicine medicine = null;
    private Certificate certificate = new Certificate();
    private Package aPackage = new Package();

    public MedicationsBuilder addTag(String tag) {

        state = getState(tag);

        switch (state) {
            case Medicine:
                this.medicine = new Medicine();
                break;
            case Certificate:
                this.certificate = new Certificate();
                break;
            case Package:
                this.aPackage = new Package();
                break;
            default:
                break;

        }
        return this;
    }

    public Builder closeTag(String tag) {
       States endTag = getState(tag);
       switch (endTag){
           case Medicine:
               medications.addMedicine(medicine);
               break;
           case Certificate:
               medicine.setCertificate(certificate);
               break;
           case Package:
               medicine.setaPackage(aPackage);
               break;
           default:
               break;
       }
        return this;

    }

    public Builder addAttribute(String name, String value) {
    if (name == null) return this;
    if (value == null) value = "";
    if (name.equalsIgnoreCase("id"))
        medicine.setId(value);
    return this;

    }

    public Builder addData(String data) {
        switch (state){
            case Name:
                medicine.setName(data);
                break;
            case Group:
                medicine.setGroup(Group.valueOf(data));
                break;
            case Pharm:
                medicine.setPharm(data);
                break;
            case ID:
                certificate.setId(Integer.parseInt(data));
                break;
            case Organization:
                certificate.setOrganization(data);
                break;
            case Date:
                certificate.setDate(data);
                break;
            case Price:
                aPackage.setPrice(Float.parseFloat(data));
                break;
            case PackageType:
                aPackage.setPackageType(data);
                break;
            case Count:
                aPackage.setCount(Integer.parseInt(data));
                break;
            case Version:
                medicine.setVersion(Versions.valueOf(data));
                break;
            default:
                break;
        }
        return this;
    }

    public Medications getRoot() {
        return medications;
    }

    private States getState(String tag){
        States[] states = States.values();

        for (States temp : states){
            if(tag.equalsIgnoreCase(temp.toString())){
                state = temp;
                return temp;
            }
        }
        return States.Empty;
    }
}
