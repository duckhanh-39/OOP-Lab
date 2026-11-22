package Lab02.Src.aims;

public class Cart {
    public static final int MAX_NUMBERED_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERED_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered < MAX_NUMBERED_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc " + disc.getTitle() + " has been added.");
        }
        else{
            System.out.println("The cart is almost full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i] == disc){
                for (int j = i; j < qtyOrdered; j++){
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered] = null;
                qtyOrdered--;
                System.out.println("The disc " + disc.getTitle() + " has been removed.");
                return;
            }
        }
        System.out.println("The disc" + disc.getTitle() + " is not found.");
    }

    public float totalCost(){
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
