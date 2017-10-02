import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class assigent2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      char ch1 = scn.next().charAt(0);
      if (ch1 - 'A' >=0 && ch1 - 'A' <26 ){
          System.out.println("uppercase");
          System.out.println(Character.toString(ch1).toLowerCase());
      }else if (ch1 - 'a' >=0 && ch1 - 'a' <26 ){
          System.out.println("lowercase");
          System.out.println(Character.toString(ch1).toUpperCase());
      } else {
          System.out.println("special character");
      }
    }
}

