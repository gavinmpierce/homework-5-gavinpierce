public class CustomerOrder {
    public String name;
    public String data;
    public int quantity;

    public CustomerOrder(){
    }

    public CustomerOrder(String name, String data, int quantity){
        this.name = name;
        this.data = data;
        this.quantity = quantity;
    }

    public int shipOrder(){
        if(quantity > 0){
            quantity = quantity - 1;
        }
        return quantity;
    }
}
