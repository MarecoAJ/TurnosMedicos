
import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.nombreCompleto = "alejo";
        doc.verNombre();
        doc.verId();
        Doctor doc2 = new Doctor();
        doc2.verId();
        Doctor doc3 = new Doctor();
        doc3.verId();
        verMenu();
    }
}
