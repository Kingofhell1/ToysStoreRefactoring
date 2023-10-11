package ToysStore2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Toys toy1 = new Toys(0, "Кукла", 25);
        Toys toy2 = new Toys(1, "Машинка", 40);
        Toys toy3= new Toys(2, "Робот", 3);
        Toys toy4 = new Toys(3, "Матрёшка", 65);

        List<Toys> toys = new ArrayList<Toys>();
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        StoreToys toyStore = new StoreToys(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();


    }



    }
