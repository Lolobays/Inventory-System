
import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        MainDisplay();
    }


    public static void MainDisplay(){
        char choice;
        System.out.println("||==============================||");
        System.out.println("||        E-GroceMarket!        ||");
        System.out.println("||==============================||");
        System.out.println("||                              ||");
        System.out.println("||        A. Admin              ||");
        System.out.println("||        B. Cashier            ||");
        System.out.println("||        C. Exit               ||");
        System.out.println("||                              ||");
        System.out.println("||==============================||");
        System.out.print("Enter your choice: ");
        choice = sc.next().toUpperCase().charAt(0);
        System.out.println("");


        switch (choice){
            case 'A':
                Admin admin = new Admin();
                admin.adminLogin();
                break;
            case 'B':
                Cashier cashier = new Cashier();
                cashier.cashierLogin();
                break;
            case 'C':
                System.out.println("Ipasa nyo po kami!! Thank you maam!");
                Display();
                System.exit(0);

                break;
        }
    }

    //Nothing to see below





































    public static void Display(){
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬜⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛⬜⬜⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛⬜⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬜⬛⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬜⬛⬜⬜⬛⬛⬛⬛⬛⬛⬛⬜⬛⬛⬛⬛⬜⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬛🟨🟨🟨⬛⬜⬜⬜⬜⬛🟨🟨🟫🟫🟨🟨⬛🟨🟫🟨🟨⬛🟨⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬛⬛⬛🟨🟫🟫🟫🟨⬛⬛⬜⬛⬛⬛🟨🟨🟨🟨🟨🟨🟫🟫🟫🟨⬛⬛🟨⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬛🟨🟨🟨🟨🟫🟫🟨🟨⬛⬛⬛🟦⬛🟨🟨🟫🟫🟫🟨🟨🟨🟨🟨⬛🟨🟨⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬛⬛🟨🟨⬛⬛🟨🟨🟨⬛⬛🟦🟦🟦🟦⬛🟨🟫🟫⬛⬛🟨🟨🟨⬛⬛🟨🟨🟨⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬛🟨⬛⬛🟨🟨⬛⬛⬛🟦🟦🟦🟦🟦⬛🟨⬛⬛⬛🟨🟨⬛⬛⬛⬛🟨🟨🟨🟫🟨⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬛🟨🟨🟨🟨🟨🟨🟨🟨⬛🟦🟦🟦⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨🟫🟫🟨⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬛🟨🟨⬛🟨⬛🟨🟨🟨⬛⬛⬛🟨🟨🟨🟨🟨🟨⬛🟨⬛🟨🟨🟨⬛🟨🟫🟫🟨⬛⬜⬜⬜⬜⬜⬜⬜⬛⬛⬜⬜⬜⬜");
        System.out.println("⬜⬛🟨⬛⬛⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨⬛⬛⬛⬛🟨🟨🟨⬛🟨🟫🟫🟨⬛⬜⬜⬜⬜⬜⬜⬛🟨🟨⬛⬜⬜⬜");
        System.out.println("⬜⬜⬛⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜⬛🟨🟨⬛🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜⬛🟨⬛🟨⬛⬜⬜⬜");
        System.out.println("⬜⬛⬜🟦🟦⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜🟦⬜⬛🟨⬛🟨🟨🟫🟨🟨⬛⬜⬛⬛⬛🟨⬛⬛🟨⬛⬜⬜⬜");
        System.out.println("⬜⬛🟦⬛🟦⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜🟦⬛🟦⬛🟨🟨⬛🟨🟫🟨🟨⬛⬛⬜⬜⬜⬛⬜⬛🟨⬛⬛⬜⬜");
        System.out.println("⬜⬛⬜🟦🟦⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨🟨⬛⬜⬜⬜🟦🟦🟦⬛🟨🟨⬛🟨🟨🟨🟨⬛⬜⬜⬜⬜⬛⬜⬛🟨⬛🟨⬛⬜");
        System.out.println("⬜⬜⬛⬜⬜⬜⬛🟨⬛🟨⬛🟨🟨🟨🟨🟨⬛⬜⬜⬜⬜⬜⬛🟨🟨🟨⬛🟨🟨🟨🟨⬛⬜⬜⬜⬜⬛⬜⬛🟨⬛⬛🟨⬛");
        System.out.println("⬜⬜⬜⬛⬛⬛🟨⬛🟨🟨⬛🟨🟨🟨🟨🟨🟨⬛⬛⬛⬛⬛🟨🟨🟨🟨⬛🟨🟨🟨🟫⬛⬜⬜⬜⬛⬛⬛🟨🟨⬛🟨⬛⬜");
        System.out.println("⬜⬜⬜⬜⬛🟨⬛🟨🟨⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨🟨🟫⬛⬛⬛⬛🟫🟫⬛🟨⬛🟨⬛⬜⬜");
        System.out.println("⬜⬜⬜⬛🟨🟨🟨⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨🟨🟨🟨🟨🟨⬛⬜⬛🟨⬛⬛⬛⬜⬜");
        System.out.println("⬜⬜⬜⬛⬛⬛⬛🟨🟨🟨🟨🟨🟨🟨⬛⬛⬛⬛⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨🟨🟨🟨🟫🟨⬛⬜⬜⬛🟫⬛🟫⬛⬜");
        System.out.println("⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨🟨⬛🟫🟫🟫🟫🟫🟫⬛🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨🟨🟨🟨🟨🟨⬛⬜⬛🟫⬛🟫⬛⬜");
        System.out.println("⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨🟨⬛🟫⬛⬛⬛⬛⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛🟨🟨🟨🟨⬛⬜⬜⬛🟫🟫⬛⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬛🟨🟨🟨🟨🟨⬛⬛⬛🟨🟨🟨🟨🟨🟨🟨⬛🟨🟨🟨🟨🟨🟨🟨🟨⬛⬛⬛🟨🟨⬛⬜⬜⬛🟫⬛⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬛🟨🟨🟨⬛⬛🟨🟨🟨⬛⬛⬛⬛⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬛⬛🟨⬛⬜⬛⬛⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬛🟨🟨⬛⬜⬛⬛⬛⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬛⬛⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬛🟨⬛⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬛🟨⬛⬜⬜⬜⬜⬜⬛🟫⬛🟫🟫⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛🟫🟫🟫⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬜⬜⬜⬜⬜⬛🟨⬛🟫⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟫🟫⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨⬛⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨🟫⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛🟨⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬜⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜");
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜");

//        ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⢿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠻⢟⠫⠫⡹⠱⡃⠆⢡⠙⠂⠘⠂⠎⠈⠒⠔⠪⠡⠉⣍⡙⡛⢟⡻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣟⡋⠇⠀⠈⠀⠁⠀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠒⢢⠀⠈⠑⠈⠔⠉⢎⠽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠋⢡⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠉⠈⠀⠀⠀⠀⠀⠀⠈⠈⠐⡹⣞⢯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⡩⠵⠊⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡘⣆⡀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠒⢸⡇⠈⠳⢿⡼⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢟⠖⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣩⣴⣶⣶⣾⣿⠿⢿⢿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣬⣥⠄⠀⠀⠀⠀⠀⠠⣷⠆⠀⠀⡛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⡡⢒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠽⠯⠉⡁⠔⠂⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠿⢋⣥⠂⠠⣀⠀⠀⠐⠀⡿⡇⢀⠣⠱⡘⢻⢻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠈⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡚⠂⠀⠄⢈⣀⣭⣬⣭⣤⣤⣤⣠⣤⣤⣤⣤⣤⣤⣤⡀⡀⠀⠀⠀⠀⠀⠀⠀⢿⣤⢂⠧⣍⠳⣉⢾⣭⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⡇⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⣶⣿⠿⠿⠿⠿⠟⠛⠛⠋⠉⠉⠉⠉⠉⠉⠉⠙⠛⠿⠿⠿⢿⣿⣷⣷⣦⣄⠀⠈⠋⠊⠑⢈⠳⡩⠞⣜⡻⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠈⠩⢉⠙⢛⣿⣿⡋⠠⠋⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢔⣒⠀⠀⠀⠉⡈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠀⠀⠬⠛⣋⠅⠀⠀⢀⠄⠀⠀⠀⠀⠁⠸⡑⢯⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠐⡆⡃⣸⣿⣟⠋⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢂⣠⣤⣥⣴⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣦⣤⣄⡆⠀⠨⠡⡐⢒⡈⣄⢣⠖⡤⠀⠀⠀⣀⠠⠘⣖⠿⡽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠠⢀⠇⢸⣿⣏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠨⠙⠛⠉⠍⠉⠉⠀⠀⠀⠀⠀⠀⠀⠠⠤⠉⠉⠩⠉⠉⠉⠀⠀⢀⠣⡑⠄⠀⠠⠛⡼⠰⡉⠄⠒⡈⠁⠀⣼⢯⡟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠐⢸⢈⢻⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠆⠀⠀⠙⠲⡂⠀⢀⠌⠀⠁⠀⠀⠀⠀⠀⠐⠬⡖⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⢸⢈⢾⣿⣇⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠤⠌⣉⣤⢠⣀⡄⣄⠁⠸⡆⠀⠀⠀⠀⠀⢠⠀⠀⢠⡍⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠹⣸⠸⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣴⣶⣦⣶⣾⣶⣴⣦⠤⣀⡀⠀⠀⠀⠀⠸⣷⣰⣶⣴⣦⣾⣿⣿⣿⣿⣦⣜⣧⡀⠀⠈⠓⠀⠀⠄⠀⢸⡤⢠⠃⣞⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠣⠁⢻⣿⣿⡆⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣰⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡄⡖⡀⠀⠁⢢⡛⢌⣡⡟⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⢂⢿⣿⣿⣧⠀⣀⣄⠀⠀⠀⠀⣠⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣱⣆⠱⣄⠈⢷⢠⢞⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⢀⠀⡀⢀⣀⣤⣀⣀⣸⣄⣢⣙⣿⣿⣿⣆⣭⠥⢄⡀⠀⠙⠁⠐⢺⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣏⡾⠕⣸⣯⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠁⠉⠉⠉⠉⠛⠉⠙⠻⠟⠉⠉⢈⣙⠻⣿⣿⣷⣦⣬⣤⡀⢀⢲⣿⣿⣿⣿⣿⣿⣿⡿⠿⣟⣻⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⣻⢿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡒⠈⠨⠕⡛⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⡀⣾⣿⣿⣿⣆⣈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⢀⣼⣿⣿⣿⣦⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠂⠀⠍⠉⠙⠛⠿⣿⣿⣿⣿⡇⢻⣿⡋⢻⣯⣿⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⢻⣿⢸⣽⣻⣿⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⡯⠁⠘⣿⣿⣿⣷⡀⠻⠛⣿⢺⠋⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣌⡙⠿⠿⡏⡹⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⢿⣿⣿⣿⣿⣷⣶⣤⣀⣼⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣶⣭⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢘⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠇⡚⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠐⢁⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⣩⣬⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⢀⣤⣾⣿⣿⠿⠛⠋⠉⡑⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠻⡝⣾⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⡿⡛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡐⣡⣾⣿⡿⠛⣽⠂⠁⠀⠀⣀⣠⣼⣿⣿⣿⣿⣿⣿⣿⠉⠀⠀⠀⠀⠀⢈⠙⢿⣯⣝⢻⣿⣿⣿⣿⣿⣿⣞⠋⠌⠸⣖⡹⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡆⠀⣼⣿⣿⢫⢇⡙⠉⣀⣴⣾⠿⠟⠛⠋⣽⣿⡿⢻⣿⡟⠉⡈⠀⠀⡀⠀⠀⠐⠀⠀⠙⣿⠘⣿⣿⣋⢿⣿⢿⢿⣿⣷⣤⣌⠓⣯⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⡆⣿⣿⢹⠅⢾⣿⡿⠟⠉⠔⠲⠤⢤⣞⣽⣿⣷⣿⣿⡏⡐⠂⠀⠀⠃⠀⠀⠀⠀⠀⠰⣽⡇⣿⣿⣧⡤⠤⠦⣤⣌⡉⢹⢿⣿⣿⣿⢿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠨⢁⠀⣿⣿⣜⠷⢮⢻⠷⢆⣠⣮⣽⣿⣿⣿⠿⣿⣿⣿⣿⢃⡇⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⣘⣿⣿⣿⣿⣿⣷⣾⣼⣙⣪⡜⡿⢿⣳⢯⣟⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠁⡙⣿⣿⣶⣾⣷⣿⣿⣿⠿⠿⠋⠉⠁⠂⠡⢻⣿⡿⢾⠠⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⢵⡘⣻⣿⣿⣿⣿⣿⣿⣿⣿⣷⣾⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠡⣼⣄⠉⠙⠛⠩⠍⠉⠀⠀⠂⠁⠀⠀⠀⠠⢰⣿⡟⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠘⣒⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⡐⣿⣿⡟⢆⠐⠀⠀⠀⠀⠀⠀⠀⠀⠉⡉⡌⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⢻⣿⡿⣾⡡⠀⠀⢀⡄⠀⠀⠀⠀⠀⢄⣸⣏⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⢿⣿⣷⣓⣧⣐⠂⡐⠡⡄⣤⢀⠮⢼⡟⣼⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣷⣮⣟⣙⣋⣙⣎⣻⣿⣷⣿⣿⡟⣱⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠀⠀⠀⠀⠀⠀⠀⡐⠤⢀⡠⠐⠤⠠⠄⠢⡐⠠⡂⠤⢠⡀⢄⢠⢐⡰⠐⠤⠣⠤⡄⢎⠠⠂⠀⠈⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿⠿⠛⡥⢊⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠀⠄⠀⠀⠀⠀⠀⠀⢀⠘⠠⢆⠩⠔⡃⠠⠡⠰⡑⡜⡲⢥⡚⣌⢢⠢⢅⡙⠌⡍⢳⡉⠦⢡⢁⡐⠠⢩⠉⡞⣿⣿⣿⣻⣿⣿⢸⠄⢃⠐⢿⡸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⣈⠸⠙⠎⠀⠀⡀⠠⢀⠄⢋⡤⢋⡖⣡⢐⠠⢇⢼⡘⢥⢣⡙⢢⣅⡋⢦⣉⢲⣈⠴⣘⠰⡠⢆⢬⠱⢆⠌⡃⢿⣿⡿⣽⣿⣯⠠⠹⢠⠛⣮⠼⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
//⠔⣒⠢⢌⢐⡃⠤⠑⢢⠰⣍⢶⣩⢒⡥⠖⣠⠎⠶⡙⣎⠶⣉⣗⠬⡜⢦⣜⠢⢞⣱⣍⡳⢧⡍⣎⠕⣋⠦⣈⣻⣿⣿⣿⣿⣗⢚⣥⢣⢍⢦⡙⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿

    }
}
































