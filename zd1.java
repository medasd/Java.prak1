import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean da = true;
        int chislo = 50;
        double chislostochkoi = 5.5;
        double rezultat = chislo + chislostochkoi;
        int chislo2 = 44;
        if(rezultat>60){
            System.out.println("bigger");
        } else {
            System.out.println("smoll");
        };
        for (int i=0; 0 < chislo2; i++){
            chislo2 = chislo2 / 2;
            
            System.out.println(chislo2);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a price: ");
        int price = scanner.nextInt();
        System.out.println("and skidka: ");
        int inputskidka = scanner.nextInt();
        int skidka = (price / 100) * inputskidka;
        int finalprice = price - skidka;
        System.out.println(finalprice);
        System.out.println("Input a Celsiya: ");
        int celsiya = scanner.nextInt();
        double farengate = (celsiya * (9 / 5)) + 32;
        System.out.println(farengate);
}
}