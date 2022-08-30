public class MainProgram {

    public static void main(String[] args) {
        Property p1 = new Property("Erzbergerstraße 1", 10, 20 );

        System.out.println(p1.getAddress() + " - " + p1.getsize() + "m²");

        Property p2 = new Property("Erzbergerstraße 2", 13, 14 );


    }

}

