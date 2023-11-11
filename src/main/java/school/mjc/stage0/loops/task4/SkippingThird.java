package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int skip = 0;
        for (int i = 1 ; i<=lastPrinted; i++){
            if (skip==2){
                skip=0;
                continue;
            }
            skip++;
            System.out.println(i);
        }
    }
}
