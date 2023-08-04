import java.util.Collections;
import java.util.List;

public class PotokServ {
    public void SortPotok(List<Potok> Potoks) {
        StreamComparator comparator = new StreamComparator();
        Collections.sort(Potok, comparator);
    }
}