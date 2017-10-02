import java.util.Scanner;

public class HW10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char ch1 = scn.next().charAt(0);
        char ch2 = scn.next().charAt(0);
        System.out.println(str.replace(ch1 , ch2));






    }
}