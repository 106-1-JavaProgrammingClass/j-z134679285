import java.util.Scanner;

public class HW12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        int b = scn.nextInt();
        float c = Math.round(a*100)/100f;
        float d = Math.round(a*1000)/1000f;
        float e = Math.round(a*10000)/10000f;
        if (b>=2 && b<3)
            System.out.println(c);
        if (b>=3 && b<4)
            System.out.println(d);
        if (b>=4 && b<5)
            System.out.println(e);

    }
}