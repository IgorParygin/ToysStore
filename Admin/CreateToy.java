package Admin;
import Model.Toy;
import View.ConsoleView;

public class CreateToy {
    
    public Toy newToy(){
        ConsoleView cView = new ConsoleView();
        Toy toy = new Toy();
        toy.setIdToy(toy.hashCode() / 10000);
        toy.setNameToy(cView.requestName());
        toy.setAmountToys(cView.requestAmount());
        toy.setWeightToy(cView.requestWeight());
        return toy;
    }
}
