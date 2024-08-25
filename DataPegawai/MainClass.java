package DataPegawai;

class MainClass {

    public static void main(String[] args) {
        MultipleLinkedList ListPegawai = new MultipleLinkedList();
        ListPegawai.add("Doni");
        ListPegawai.add("Hadi");
        ListPegawai.add("Budi");
        ListPegawai.add("Raka");

        MultipleLinkedList teamDoni = new MultipleLinkedList();
        teamDoni.add("Bobi");
        teamDoni.add("Nesa");
        
        MultipleLinkedList teamHadi = new MultipleLinkedList();
        teamHadi.add("Roni");
        teamHadi.add("Putri");
        teamHadi.add("Dinda");
        
        MultipleLinkedList teamRaka = new MultipleLinkedList();
        teamRaka.add("Reni");

        MultipleLinkedList teamDinda = new MultipleLinkedList();
        teamDinda.add("Dini");
        teamDinda.add("Joni");

        ListPegawai.addSubListAt(1, teamDoni);
        ListPegawai.addSubListAt(2, teamHadi);
        ListPegawai.addSubListAt(4, teamRaka);

        teamHadi.addSubListAt(3, teamDinda);

        //Print menggunakan method overide toString
        System.out.println("Data Pegawai\n" + ListPegawai);

        int size = teamDinda.size;
        System.out.println("Jumlah pegawai : " + size);

        // String pecatPegawai = "Joni";

        // ListPegawai.remove(pecatPegawai);
        
        // System.out.println("\nData pegawai setelah " + pecatPegawai + " dihapus\n" + ListPegawai);
        
        // Mencari apakah ada pegawai dengan nama Joni
        // Node cariJoni = ListPegawai.findNode("Joni");
        
        // System.out.println(cariJoni != null ? "\nAda Joni" : "\nTidak ada Joni");
        
        //Print menggunakan method display
        // System.out.println("\nData Multiple Linked List pegawai :");
        // ListPegawai.display();
    }
}
