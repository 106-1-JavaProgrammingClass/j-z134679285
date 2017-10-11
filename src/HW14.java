import java.util.Scanner;

public class HW14 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch1 = scn.next().charAt(0);
        int a = (int)ch1;
        System.out.println(Integer.toHexString(a));


    }
}