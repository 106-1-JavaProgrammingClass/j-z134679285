
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        System.out.println(Math.round(v1*1.6*10f)/10f);
    }
}