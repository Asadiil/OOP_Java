public class Controller {
    private PotokServ potokServ;

    public Controller() {
        potokServ = new potokServ();
    }

    // остальной код класса

    public void SortPotok(List<Potok> Potoks) {
        potokServ.SortPotok(Potoks);
    }
}