import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Cashier {
    static Scanner sc = new Scanner(System.in);
    private static final String INVENTORY_FILE = "inventory.txt";
    private static final String RECEIPT_FILE = "checkout.txt";
    private static final String CASHIER_FILE = "cashiers.txt";

    public void cashierLogin() {
        System.out.print("Enter your username: ");
        String DUsername = sc.next();
        System.out.print("Enter your password: ");
        String DPassword = sc.next();

        try (BufferedReader reader = new BufferedReader(new FileReader(CASHIER_FILE))) {
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");

                if (tokens[1].equals(DUsername) && tokens[2].equals(DPassword)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Successfully logged in.");
                displayCashier();
            } else {
                System.out.println("Incorrect username or password.");
                Main main = new Main();
                main.MainDisplay();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No records found.");
        } catch (IOException e) {
            System.out.println("Error reading the cashier file.");
        }
    }

    public void displayCashier(){
        while(true) {
            System.out.println("\n||=====================================================||");
            System.out.println("|| Welcome to E-GroceMarket! Please enter your choices ||");
            System.out.println("||=====================================================||");
            System.out.println("||                                                     ||");
            System.out.println("||     A. Cart Item                                    ||");
            System.out.println("||     B. Checkout                                     ||");
            System.out.println("||     C. Return                                       ||");
            System.out.println("||                                                     ||");
            System.out.println("||=====================================================||");

            System.out.print("Enter your choice: ");
            char choice = sc.next().toUpperCase().charAt(0);


            switch (choice) {
                case 'A':
                    System.out.println("Instructions: Case sensitive || If you want to exit enter both Zero (0) on both question ");
                    while(true){
                        List<String> lines = new ArrayList<>();
                        String validation = "0?";

                        System.out.print("Choose Product: ");
                        String productChoice = sc.next();
                        System.out.print("Enter Quantity: ");
                        int quantityChoice = sc.nextInt();

                        // Read the contents of the notepad file into a list
                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(INVENTORY_FILE))) {
                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                lines.add(line);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        //update the relevant stock information
                        for (int i = 0; i < lines.size(); i++) {
                            String line = lines.get(i);
                            if (line.startsWith(productChoice, 4)) {
                                // Extract the stock name and current quantity from th  e line
                                String[] parts = line.split(" ");
                                String productId = parts[0];
                                String stockName = parts[1];
                                int currentQuantity = Integer.parseInt(parts[2]);
                                double productPrice = Double.parseDouble(parts[3]);


                                // Update the current quantity
                                int newQuantity = currentQuantity - quantityChoice;

                                // Update the line with the new quantity
                                lines.set(i,productId + " " +stockName + " " + newQuantity + " " + productPrice);

                                //Total price
                                double totalPrice = productPrice * quantityChoice;

                                //Write receipt file on different notepad
                                try(BufferedWriter bw = new BufferedWriter(new FileWriter(RECEIPT_FILE, true))){
                                    bw.write(productChoice + " " + quantityChoice + " " + productPrice + " " + totalPrice + "\n");
                                }catch (Exception e){
                                    e.printStackTrace();
                                }

                            }
                        }

                        // Write the updated stock information back to the notepad file
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(INVENTORY_FILE))) {
                            for (String line : lines) {
                                writer.write(line);
                                writer.newLine();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        String convertInt = Integer.toString(quantityChoice);
                        if(productChoice.matches(validation) && convertInt.matches(validation)){
                            System.out.println("Checkout:");
                            //List item and total price
                            break;
                        }else{
                            System.out.println("");
                            continue;
                        }
                    }break;
                case 'B':
                    File file = new File(RECEIPT_FILE);
                    if(file.exists() && file.length() == 0) {
                        System.out.println("Cart is empty, go buy bili!");
                        break;
                    }
                    try (BufferedReader br = new BufferedReader(new FileReader(RECEIPT_FILE))){
                        System.out.println("===============  E-GroceMarket Checkout! ===============");

                        String line;
                        double totalPrice = 0;
                        while ((line = br.readLine()) != null) {
                            String[] values = line.split(" ");

                            if (values.length == 4) { // Assuming each line has three values: name, quantity, and price
                                String name = values[0];
                                int quantity = Integer.parseInt(values[1]);
                                double price = Double.parseDouble(values[2]);
                                double total = Double.parseDouble(values[3]);
                                totalPrice += total;


                                System.out.println("Name: " + name);
                                System.out.println("Quantity: " + quantity);
                                System.out.println("Price: " + price);
                                System.out.println("Total: " + total);
                                System.out.println("------------------");
                            }
                        }
                        System.out.println("Total: " + totalPrice);
                        System.out.println("Confirm order (Y/N): ");
                        char input = sc.next().toUpperCase().charAt(0);

                        if (input == 'Y'){
                            double money = 0;

                            while(true) {
                                System.out.println("Enter amount to pay: ");
                                money = sc.nextInt();

                                if (money < totalPrice) {
                                    System.out.println("Insufficient payment! ");
                                }else if (money >= totalPrice){
                                    break;
                                }

                            }
                                double leftChange = money - totalPrice;

                                System.out.println("Change: " + leftChange);
                                System.out.println("Thank you for shopping");

                                //Empty all values inside the notepad
                                BufferedWriter bw = new BufferedWriter(new FileWriter(RECEIPT_FILE));
                                bw.write("");
                                bw.close();


                        }else if(input == 'N'){
                            System.out.println("Enjoy Shopping");
                            continue;

                        }else{
                            System.out.println("Invalid Input");
                        }

                        System.out.println("===============================================================");
                    }catch(FileNotFoundException e){
                        System.out.println("Empty Cart");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 'C':
                    Main.MainDisplay();
                    break;
            }
        }
    }
}
