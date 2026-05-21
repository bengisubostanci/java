import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // calculating grade point average

        Scanner input=new Scanner(System.in);
        int fizik,matematik,türkçe,kimya;
        float sonuc;
        System.out.print("fizik notunuz");
        fizik=input.nextInt();

        System.out.print("Matematik notunuz");
        matematik=input.nextInt();

        System.out.print("Türkçe notunuz");
        türkçe=input.nextInt();

        System.out.print("Kimya notunuz");
        kimya=input.nextInt();

        sonuc=(fizik+matematik+türkçe+kimya)/4;
        System.out.println("ortalamanız:" +sonuc);

        //VAT amount

        //The scanner library is already defined.
        
        double price = 0.0;
        int rate=18;
        System.out.print("please enter amount");
        price=input.nextDouble(); 
        System.out.print(price);
        double vate_amount=price*(rate/100);
        System.out.print(vate_amount);
        double total=vate_amount+price;
        System.out.println(total);




    }
}

