import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Find Maximum Problem using Generics");
        Scanner sc=new Scanner(System.in);
        System.out.print("How many integers do you want to enter? ");
        int n=sc.nextInt();
        Integer[] intArray=new Integer[n];
        System.out.println("Enter "+n+" integers:");
        for (int i=0;i<n;i++) {
            intArray[i]=sc.nextInt();
        }
        Maximum<Integer> intMax=new Maximum<>(intArray);
        System.out.println(intMax.testMaximum().get()+" is the maximum integer.");
        System.out.print("How many floats do you want to enter? ");
        int nF=sc.nextInt();
        Float[] floatArray=new Float[nF];
        System.out.println("Enter "+nF+" floats:");
        for (int i=0;i<nF;i++) {
            floatArray[i]=sc.nextFloat();
        }
        Maximum<Float> floatMax=new Maximum<>(floatArray);
        System.out.println(floatMax.testMaximum().get()+" is the maximum Float.");
        System.out.print("How many strings do you want to enter? ");
        int nS=sc.nextInt();
        sc.nextLine();
        String[] stringArray=new String[nS];
        System.out.println("Enter "+nS+" strings:");
        for (int i=0;i<nS;i++) {
            stringArray[i]=sc.nextLine();
        }
        Maximum<String> stringMax=new Maximum<>(stringArray);
        System.out.println(stringMax.testMaximum().get()+" is the maximum String.");
    }
}
