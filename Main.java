import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //1
//        System.out.println("Enter number");
//        int number=s.nextInt();
//        if(number%2==0) {
//            System.out.println("The number is even");
//
//        }
//        else System.out.println("The number is odd");

        //2
//        System.out.println("Enter number");
//        int num=s.nextInt();
//        int sum=0;
//        while (num!=0) {
//            sum=sum+num;
//            System.out.println("Enter number");
//            num=s.nextInt();
//        }
//        System.out.println(sum);

//        int []a={10,-21,30,31,-25};
//        for(int n :a) {
//            if(n>0){
//                System.out.println(n + " is a positive number");
//            }
//            else System.out.println(n + " is a negative number");
//
//        }
        String [] sentence={"Tuwaiq", "Bootcamp" , "Student","JAVA"};
        for(String n : sentence){
            int x=n.length();
            System.out.println(x);

        }



    }

}