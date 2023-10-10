public class TestTeque {
    public static void main(String[] args) {
        Teque t = new Teque();

        t.push_back(7);
        t.push_back(15);
        t.push_back(22);

        t.push_front(5);
        t.push_front(1);

        t.push_middle(12);
        t.push_middle(9);

        System.out.println("-Queue-");
        t.printQueue();
        System.out.println("-End of queue-");

        System.out.println("\nI posisjon 3 så ligger det: "+t.get(3));

        System.out.println("\nHenter fra første element i queue-en:");
        System.out.println(t.hent()+"\n");

        System.out.println("-Queue-");
        t.printQueue();
        System.out.println("-End of queue-");
    }
}
