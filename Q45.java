import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int total = 0;
        do {
            System.out.println("Enter 1 for Indian\n" +
                    "Enter 2 for Chinese\n" +
                    "Enter 3 for Italian\n" +
                    "Enter 4 for Exiting program\n");
            n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Welcome to Indian Menu");
                    System.out.println("Enter 1 for chole bhature - rs.100\n" +
                            "Enter 2 for paneer kulche - rs.200\n");
                    int a = sc.nextInt();

                    switch (a){
                        case 1-> total = total + 100;
                        case 2-> total = total + 200;
                    }
                }
                case 2 -> {
                    System.out.println("Welcome to Chinese");
                    System.out.println("Enter 1 for noodles - rs.150\n" +
                            "Enter 2 for manchurian - rs.200\n");
                    int a = sc.nextInt();

                    switch (a){
                        case 1-> total = total + 150;
                        case 2-> total = total + 200;
                    }
                }
                case 3 -> {
                    System.out.println("Welcome to Italian Menu");
                    System.out.println("Enter 1 for pasta - rs.150\n" +
                            "Enter 2 for pizza - rs.450\n");
                    int a = sc.nextInt();

                    switch (a){
                        case 1-> total = total + 150;
                        case 2-> total = total + 450;
                    }
                }
                case 4 -> {
                    System.out.println("Total " + total);
                    System.exit(0);
                }
                default -> System.out.println("Invalid Input");
            }
        } while (n != 4);
            System.out.println("Total = " + total);
    }
}
