import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Find Maximum Problem using Generics");
        Scanner sc=new Scanner(System.in);
        Maximum<Integer> intMax=new Maximum<>(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println(intMax.FindMax()+" is the maximum number.");
        Maximum<Float> FloatMax=new Maximum<>(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        System.out.println(FloatMax.FindMax()+" is the maximum number.");
        Maximum<String> StringMax=new Maximum<>(sc.next(),sc.next(),sc.next());
        System.out.println(StringMax.FindMax()+" is the maximum String.");
    }
}
