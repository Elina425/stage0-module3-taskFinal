package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousand = number/1000;//4
        int thousands = number %1000;//225
        int hundred = thousands /100;//2
        int hundreds = thousands %100;//25
        int ten = hundreds /10;//2
        int tenth = hundreds %10;//5
        int sum = thousand + hundred + ten + tenth;
        System.out.println(sum);
    }
}
