package Parser;

import Entity.Medications;
import validator.ValidatorXML;

public class MedicationsParser {
    private DrugParser<Medications> parser;

    public MedicationsParser(DrugParser<Medications> parser) {
        this.parser = parser;
    }

    public Medications parse (String xml, String xsd){
        if (!ValidatorXML.validate(xml, xsd)){
            return null;
        }
        try{
            return parser.parseMedicine(xml);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
