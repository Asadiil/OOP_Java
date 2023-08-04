import java.util.Comparator;

public class StreamComparator implements Comparator<Potok> {
    @Override
    public int compare(Potok Potok1, Potok Potok2) {
        return Potok1.QuaPotok() - Potok2.QuaPotok();
    }
}