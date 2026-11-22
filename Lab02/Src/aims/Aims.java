package Lab02.Src.aims;

public class Aims {
    public static void main(String[] args){
        Cart anOrder = new Cart();
        DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King",
                    "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars",
            "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladin", 
                    "Animation", 18.99f);
        
        anOrder.addDigitalVideoDisc(disc1);
        anOrder.addDigitalVideoDisc(disc2);
        anOrder.addDigitalVideoDisc(disc3);

        System.out.print("The total cost is: ");
        System.out.println(anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(disc2);
        System.out.print("The total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
