import Hand.SamsungHand;
import Hand.SonyHand;
import Hand.ToshibaHand;
import Head.SamsungHead;
import Head.SonyHead;
import Head.ToshibaHead;
import Leg.SamsungLeg;
import Leg.SonyLeg;
import Leg.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(Head.IHead, Hand.IHand, Leg.ILeg)
        Класс Head.SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SamsungHand samsungHand = new SamsungHand(150);
        SonyHand sonyHand = new SonyHand(144);
        ToshibaHand toshibaHand = new ToshibaHand(151);

        SamsungHead samsungHead = new SamsungHead(170);
        SonyHead sonyHead = new SonyHead(135);
        ToshibaHead toshibaHead = new ToshibaHead(120);

        SamsungLeg samsungLeg = new SamsungLeg(195);
        SonyLeg sonyLeg = new SonyLeg(196);
        ToshibaLeg toshibaLeg = new ToshibaLeg(200);

        Robot robotOne = new Robot(toshibaHead, sonyHand, samsungLeg);
        Robot robotTwo = new Robot(samsungHead, toshibaHand, sonyLeg);
        Robot robotThree = new Robot(sonyHead, samsungHand, toshibaLeg);

        System.out.println("Цена первого робота: " + robotOne.getPrice());
        System.out.println("Цена второго робота: " + robotTwo.getPrice());
        System.out.println("Цена третьего робота: " + robotThree.getPrice());

        robotOne.action();
        System.out.println();
        robotTwo.action();
        System.out.println();
        robotThree.action();
        System.out.println();

        int robotOnePrice=robotOne.getPrice();
        int robotTwoPrice=robotTwo.getPrice();
        int robotThreePrice=robotThree.getPrice();

        int [] robots = new int[3];
        robots[0]=robotOnePrice;
        robots[1]=robotTwoPrice;
        robots[2]=robotThreePrice;
        int maxId = 0;
        int maxValue = 0;
        for(int i = 0; i < robots.length; i++){
            if(robots[i] > maxValue) {
                maxId = i;
                maxValue = robots[i];
            }
        }
        System.out.println("Самый дорогой робот: " + robots[maxId]);
    }
}
