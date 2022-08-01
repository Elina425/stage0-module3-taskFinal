package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int original = number/10;//10
        int oremainder = number %10;//24
        int tenth = oremainder/10;//2
        int remainder = oremainder % 10;//4
         int reverse = remainder * 100 + tenth *10 + original;
        System.out.println(reverse);
    }
}
