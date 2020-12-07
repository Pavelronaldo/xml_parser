import Builder.MedicationsBuilder;
import Entity.Medications;
import Parser.DrugSAXParser;
import Parser.MedicationsParser;

public class Main {
    public static void main(String[] args) {

        String xml = "src/main/resources/Medications.xml";
        String xsd = "src/main/resources/Medications.xsd";
        String novalid = "src\\main\\resources\\NotValidXML.xml";
        DrugSAXParser<Medications> saxParser = new DrugSAXParser<Medications>(new MedicationsBuilder());
        MedicationsParser parser = new MedicationsParser(saxParser);
        Medications medications = parser.parse(xml,xsd);
        System.out.println(medications);
        medications.sortMedicines();
        System.out.println(medications);

    }
}
