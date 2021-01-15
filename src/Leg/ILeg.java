package Leg;

public interface ILeg {
   default void step() {
       System.out.println("Шагаю!");
   };
    int getPrice();
}
