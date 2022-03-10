import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
    
        LinkedList<String> saya = new LinkedList<String>();
        saya.add("F");
        saya.add("A");
        saya.add("Y");
        saya.add("Z");
        saya.add("A");
        saya.add("");
        saya.add("Z");
        saya.add("E");
        saya.add("E");
        saya.add("V");
        saya.add("A");
        saya.add("N");
        saya.add("I");
        saya.add("A");
        saya.add(" ");
        saya.add("P");
        saya.add("U");
        saya.add("T");
        saya.add("R");
        saya.add("I");
    

        System.out.println(saya);
        System.out.println("size = "+saya.size());

        //Add LinkedList
        saya.addFirst("F");
        saya.addLast("I");
        System.out.println("output tambah F&L = "+saya);
        System.out.println("size = "+saya.size());

        saya.add(" ");
        saya.add("C");
        saya.add("I");
        saya.add("M");
        saya.add("I");
        System.out.println("output tambah = "+saya);
        System.out.println("size = "+saya.size());

        //set linkedlist =
        saya.set(4,"V" );
        saya.set(6,"A" );
        saya.set(7,"J" );
        saya.set(10,"P");
        saya.set(20,"A" );
    
        System.out.println("output sisip = "+saya);
        System.out.println("size = "+saya.size());

        //remove linkedlist
        saya.removeFirst();
        saya.removeLast();
        System.out.println("output hapus F&L = "+saya);
        System.out.println("size = "+saya.size());

        saya.remove(5);
        saya.remove(6);
        saya.remove(10);
        System.out.println("output hapus = "+saya);
        System.out.println("size = "+saya.size());

        //pop and push
        saya.pop();
        System.out.println("output POP = "+saya);
        System.out.println("size = "+saya.size());

        saya.push("H");
        System.out.println("output PUSH = "+saya);
        System.out.println("size = "+saya.size());
        

    }
    
}