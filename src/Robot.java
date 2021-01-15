import Hand.IHand;
import Head.IHead;
import Leg.ILeg;

public class Robot implements IRobot{
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hans, ILeg leg) {
        this.head = head;
        this.hand = hans;
        this.leg = leg;
    }
    public void action (){
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        int price=head.getPrice()+hand.getPrice()+leg.getPrice();
        return price;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hans) {
        this.hand = hans;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

}
