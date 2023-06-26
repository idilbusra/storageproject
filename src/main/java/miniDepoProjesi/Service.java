package miniDepoProjesi;

import java.util.Scanner;

public class Service extends Urun {

    public Service(String id, String urunIsmi, String uretici, double miktar, String birim, String raf) {
        super(id, urunIsmi, uretici, miktar, birim, raf);
    }

    public static Scanner input = new Scanner(System.in);

    public Service() {
    }

    public void urunTanimla(){
        System.out.println("Urun ismini giriniz: ");
        String urunIsmi = input.nextLine();

        System.out.println("Uretici bilgisi giriniz: ");
        String uretici =input.nextLine();

        System.out.println("Urun miktarini giriniz: ");
        double miktar =input.nextDouble();

        System.out.println("Urun birimi giriniz: ");
        String birim = input.nextLine();

        System.out.println("Urunun rafini giriniz: ");
        String raf =input.nextLine();

    }

    public void urunListele() {
        //MAP ile yapacagiz ama nasil ? :D
    }

    public void urunGir(){

    }

    public void urunuRafaKoy(){
        System.out.println("Lutfen rafa konulacak urunun id giriniz");
        String id= input.nextLine();

        System.out.println("Lutfen raf numarasini giriniz: ");
        String raf =input.nextLine();
        System.out.println("id : "+ id+"raf: "+raf);

        //get(id).set(raf) ??
    }


    public void urunCikisiYap(){
        System.out.println("Sectiginiz urunun id giriniz: ");
        String id= input.nextLine();

        //If else yapalim


    }

}