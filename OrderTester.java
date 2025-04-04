public class OrderTester {

    public static void main(String[] args) {
        OrderQueue line = new OrderQueue(14);

        // add customers with quantity of 5,5, and 8
        line.newOrder(5);
        line.newOrder(5);
        line.newOrder(8);

        System.out.println(line.toString());

        line.fireSale();

        System.out.println(line.toString());

        for(int i = 0; i < 10; i++){
            line.addStock();
        }

        line.newOrder(3);
        line.newOrder(3);
        line.newOrder(5);


        line.fireSale();

        
        System.out.println(line.toString());
    }
}
