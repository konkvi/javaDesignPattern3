package iterator;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer>{
    protected Random random;
    int min;
    int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntegerIterator(max, min);
    }
}
