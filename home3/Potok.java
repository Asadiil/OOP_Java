import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<WorkGroup> {
    private List<WorkGroup> Group;

    public Potok() {
        Group = new ArrayList<>();
    }

    public void AddGroup(WorkGroup Group) {
        Group.add(Group);
    }

    @Override
    public Iterator<WorkGroup> iterator() {
        return Group.iterator();
    }
}