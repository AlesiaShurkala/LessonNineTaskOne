package Hand;

public interface IHand {
    default void upHand(){
        System.out.println("Поднимаю руку!");
    };
    int getPrice();

}
