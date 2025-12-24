import java.util.Arrays;
import java.util.Optional;

public class Maximum<T extends Comparable<T>>{
    private T[] values ;

    public Maximum(T... values){
        this.values=values;
    }
    public static <T extends Comparable<T>> Optional<T> testMaximum(T... values){
        if (values==null || values.length==0){
            return Optional.empty();
        }
        Arrays.sort(values);
        T max=values[values.length-1];
        printMax(max);
        return Optional.of(max);
    }
    public static <T> void printMax(T value){
        System.out.println("The maximum value is: "+value);
    }
    public Optional<T> testMaximum(){
        return Maximum.testMaximum(values);
    }
}
