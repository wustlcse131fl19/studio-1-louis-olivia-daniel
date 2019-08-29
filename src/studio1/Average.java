package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int s0 = ap.nextInt("Integer 1?");
        int s1 = ap.nextInt("Integer 2?");
        double Average = ((s0 + s1) / 2.0);
        System.out.println((Average));
    }
}
