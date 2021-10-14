package iterator;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Consumer;

public class IntegerIterator implements Iterator<Integer> {
    protected Random random;
    int max;
    int min;

    public IntegerIterator(int max, int min) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return random.nextInt(max - min + 1) + min;
    }

}
