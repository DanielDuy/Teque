class Teque {
    class Node {
       Node neste;
       int verdi;

       public Node (int pVerdi) {
           verdi = pVerdi;
       }

       public void setNeste(Node pNeste) {
           neste = pNeste;
       }

       public Node hentNeste() {
           return neste;
       }

       public int hentVerdi() {
           return verdi;
       }
   }

   int lengde = 0;
   Node hode;

   public void push_back(int pVerdi) {
       if (hode == null) {
           hode = new Node(pVerdi);

       } else {
           Node temp = hode;
           while (temp.hentNeste() != null) {
               temp = temp.hentNeste();
           }
           temp.setNeste(new Node(pVerdi));
       }
       lengde++;
   }

   public void push_front(int pVerdi) {
       if (hode == null) {
           hode = new Node(pVerdi);

       } else {
           Node temp = new Node(pVerdi);
           temp.setNeste(hode);
           hode = temp;
       }
       lengde++;
   }

   public void push_middle(int pVerdi) {
        int posisjonMidten = (lengde+1)/2;

        Node tempForrige = hode;
        for (int i = 1; i < posisjonMidten; i++) {
            tempForrige = tempForrige.hentNeste();
        }

        Node tempNeste = tempForrige.hentNeste();
        Node nyNode = new Node(pVerdi);
        tempForrige.setNeste(nyNode);
        nyNode.setNeste(tempNeste);

        lengde++;
   }

   // Obs! Første posisjon er 1.
   public int get(int pPosisjon) {
       Node temp = hode;
       for (int i = 1; i < pPosisjon; i++) {
           temp = temp.hentNeste();
       }
       return temp.hentVerdi();
   }

   public void printQueue() {
       Node temp = hode;
       while (temp.hentNeste() != null) {
           System.out.println(temp.hentVerdi());
           temp = temp.hentNeste();
       }
       System.out.println(temp.hentVerdi());
   }

   public int hent() {
       Node temp = hode;
       hode = temp.hentNeste();
       temp.setNeste(null);
       lengde--;
       return temp.hentVerdi();
   }
}
