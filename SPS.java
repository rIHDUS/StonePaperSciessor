import java.util.Scanner;
import java.util.Random;

public class SPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("==============Welcome to stone paper scissor============");
        System.out.println("\t\t1.Stone O");
        System.out.println("\t\t2.Paper []");
        System.out.println("\t\t3.Scissor X");
        System.out.println("\t\t4.exit");
        int ch;
        do {
            System.out.println("Select any one by number...");
            ch = sc.nextInt();
            switch (ch) {
                case 1: // Stone
                    int x = rn.nextInt(3);
                    System.out.print("Computer selected :");
                    System.out.println(x);
                    if (x == ch) {
                        System.out.println("Tied");
                    } else if (ch < x && x == 1) {
                        System.out.println("You lost");
                    } else if (ch < x && x == 2) {
                        System.out.println("You won");
                    } else {
                        System.out.println("error");
                    }
                    break;
                case 2: // paper
                    int y = rn.nextInt(3);
                    System.out.print("Computer selected :");
                    System.out.println(y);
                    if (y == ch) {
                        System.out.println("Tied");
                    } else if (ch > y && y == 0) {
                        System.out.println("You won");
                    } else if (ch < y) {
                        System.out.println("You lost");
                    } else {
                        System.out.println("error");
                    }
                    break;
                case 3: // scissor
                    int z = rn.nextInt(3);
                    System.out.print("Computer selected :");
                    System.out.println(z);
                    if (z == ch) {
                        System.out.println("Tied");
                    } else if (z < ch && z == 0) {
                        System.out.println("You lost");
                    } else if (ch > z && z == 1) {
                        System.out.println("You won");
                    } else {
                        System.out.println("You won");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter valid number:(");

            }
        } while (ch != 4);
    }
}
