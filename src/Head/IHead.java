package Head;

public interface IHead{
    default void speak(){
        System.out.println("Говорю!");
    };
    int getPrice();
}
