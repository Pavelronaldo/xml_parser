package Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Medications {
    private List<Medicine> medicines;

    public Medications(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void addMedicine(Medicine medicine) {
        this.medicines.add(medicine);
    }

    public Medications() {
        medicines = new ArrayList<>();
    }

    public void sortMedicines(){
        Collections.sort(medicines);
    }

    @Override
    public String toString() {
        return "Medications{" +
                "drugs=" + medicines +
                "}";
    }
}
