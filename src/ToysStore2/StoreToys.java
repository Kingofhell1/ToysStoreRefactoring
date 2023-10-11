package ToysStore2;

import java.io.FileWriter;
import java.io.IOException;

import java.util.List;


public class StoreToys {
    private List<Toys> toys;

    public StoreToys(List<Toys> toys) {
        this.toys = toys;
    }

    public Toys getToyForPrice() {
        RandomToyChooser random = new RandomToyChooser();
        Toys toy = random.chooseOnWeight(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toys toy = getToyForPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("ToysStore2.Toys.txt", true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}
