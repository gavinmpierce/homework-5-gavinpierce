public class OrderQueue {
    
    public LinkedQueue<CustomerOrder> superAwesomeQueue;

    public int stock;
    public int queueSize;

    public OrderQueue(){
        queueSize = 0;
        stock = 0;
        this.superAwesomeQueue = new LinkedQueue<CustomerOrder>();
    }
    public OrderQueue(int stock){
        this.stock = stock;
        this.superAwesomeQueue = new LinkedQueue<CustomerOrder>();
    }

    public void newOrder(int total){
        CustomerOrder john = new CustomerOrder("john", "1020", total);
        
        superAwesomeQueue.enqueue(john);
    }

    public void addStock(){
        stock += 1;
    }

    public void completeOrder(){
        CustomerOrder leader = superAwesomeQueue.peek();
        leader.quantity -= 1;
        stock -= 1;
        if (leader.quantity == 0){
            superAwesomeQueue.dequeue();
        }
    }

    public void fireSale(){
        while(stock > 0){
            completeOrder();
        }
    }

    public String toString(){
        CustomerOrder leader = superAwesomeQueue.peek(); 
        return "" + leader.quantity;
    }
}
