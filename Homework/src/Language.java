public class Language {

    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;


        do {
            System.out.println("For English press '1' ");
            System.out.println("For Russian press '2' ");
            System.out.println("For French press '3' ");
            choice =(char) System.in.read();
            do {
                ignore=(char) System.in.read();

            }while(ignore != '\n');
            }while (choice < '1' | choice > '3');
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("Hello, World!");
                break;
            case '2':
                System.out.println("Привет, Мир!");
                break;
            case '3':
                System.out.println("Bonjour le monde!");
                break;
        }




    }
}






//                    System.out.println("Hello, World!");
//
//
//                    System.out.println("Привет, Мир!");
//
//                    System.out.println("Bonjour le monde!");






