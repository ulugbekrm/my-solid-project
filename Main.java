import java.util.Scanner;

interface MyFunction {
    void Lastbil();
}

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.Lastbil();
    }
}

class Vehicle implements MyFunction {

    @Override
    public void Lastbil() {
        String type = "Skåpbil";
        String type2 = "Lätt lastbil";
        String type3 = "Tung lastbil";
        int vikt;

        System.out.println("Vilken bil vill du lasta av?");
        Scanner scanner = new Scanner(System.in);
        type = scanner.nextLine();

        System.out.println("Hur mycket vägar ditt fordon?");
        vikt = (int) scanner.nextInt();

        if (vikt < 3500) {
            System.out.println(type + "\n" + vikt + "\nDu kan avlasta vid ´A´ och ´B´");

        } else if (vikt >= 3500 && vikt < 5000) {
            System.out.println(type2 + "`\n" + vikt + "\nDu kan avlasta vid `A`");

        } else if (vikt >= 5000 && vikt < 6000) {
            System.out.println(type2 + "\n" + vikt + "\nDu kan avlasta vid `C` och `D`");

        } else if (vikt >= 6000 && vikt < 9000) {
            System.out.println(type3 + "`\n" + vikt + "\nDu kan avlasta vid ´D´");

        } else {
            System.out.println(type3 + "`\n" + vikt + "\nDu kan avlasta vid ´E´");

        }
    }

}