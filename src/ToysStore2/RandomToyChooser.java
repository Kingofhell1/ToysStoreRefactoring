package ToysStore2;

import java.util.List;

class RandomToyChooser {
    public Toys chooseOnWeight(List<Toys> toys) {
        double completeWeight = 0.0;
        for (Toys toy : toys)
            completeWeight += toy.getWeight();
        double r = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (Toys toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight >= r)
                return toy;
        }
        throw new RuntimeException("Should never be shown.");
    }
}