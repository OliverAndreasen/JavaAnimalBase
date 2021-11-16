import java.util.Comparator;

public class DescComperator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getDesc().compareTo(o2.getDesc());
    }
}
