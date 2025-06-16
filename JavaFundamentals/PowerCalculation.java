package JavaFundamentals;

import java.util.Scanner;
import java.util.*;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextInt();
        double e = sc.nextInt();
        double p = Math.pow(b, e);
        System.out.println(p);

    }
}
