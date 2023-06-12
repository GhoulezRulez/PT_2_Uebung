public class Main {
    public static void machWas(int i){} // nimmt integer Objekte an
    public static void machWasAnderes(int i){ // nimmt nur int Datentypen an

    }
    public static void main(String[] args) {

        int i = 42;
        machWas(i); // wird an eine Methode geschickt die nur Integer-Objekte annehmen sollte

        Integer iEingepackt = 42;
        machWasAnderes(iEingepackt); // wird an eine Methode geschickt die nur primitve int annehmen sollte
    }

}