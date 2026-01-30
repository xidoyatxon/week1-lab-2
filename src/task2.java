//public class Lab2_week1 {
//    public static void main() {
//        System.out.printf("passed the exam: %b%n", true);
//    }
//}

//public class Lab2_week1 {
//    public static void main(){
//        System.out.printf("%d%n",42);
//        System.out.printf("%f%n",9.5000);
//        System.out.printf("Good%nMorning%n");
//    }
//}

//public class Lab2_week1{
//    public static void main(){
//    System.out.printf("|%10d|%-8d|%d",100,200,3);
//    System.out.printf("%2$d %1$d",10,100);
//    }
//}


//public class Lab2_week1{
//    public static void main(){
//        System.out.print("Java's Primitive Types\n");
//        System.out.print("___________________________________\n");
//        System.out.printf("|%-10s|%-10s|%-4s|%n","CATEGORY","NAME","BITS");
//        System.out.print("___________________________________\n");
//        System.out.printf("|%-10s|%-10s|%04d|%n","Floating","double",64);
//        System.out.printf("|%-10s|%-10s|%04d|%n","Floating","float",32);
//        System.out.printf("|%-10s|%-10s|%04d|%n","integral","long",64);
//        System.out.printf("|%-10s|%-10s|%04d|%n","integral","int",32);
//        System.out.printf("|%-10s|%-10s|%04d|%n","integral","char",16);
//        System.out.printf("|%-10s|%-10s|%04d|%n","integral","short",16);
//        System.out.printf("|%-10s|%-10s|%04d|%n","integral","byte",0);
//        System.out.printf("|%-10s|%-10s|%04d|%n","boolean","boolean",1);
//    }
//}


//import java.util.Scanner;
//     public class Lab2_week1 {
//         public static void main() {
//             System.out.print("what is the radius:");
//             Scanner ab = new Scanner(System.in);
//             double radius = ab.nextDouble();
//             System.out.print("what is the length:");
//             ab = new Scanner(System.in);
//             double lenght = ab.nextDouble();
//
//             Double area = Math.sqrt(3) / 4 * lenght;
//             Double volume = area * lenght;
//             System.out.print("the area is "+area+ "\n" );
//             System.out.print("the volume is:"+ volume+"\n");
//         }
// }


//tax and price
//import java.util.Scanner;
//public class Lab2_week1{
//    public static void main(){
//        System.out.print("what is the price of your food: ");
//        Scanner ab=new Scanner(System.in);
//        int price=ab.nextInt();
//        int tax=(price/100)*12;
//        int tip=(price/100)*18;
//        System.out.print("the tax amount is:"+tax+"\n");
//        System.out.print("the tip amount is:"+tip+"\n");
//    }
//
//}

//cost of driving
import java.util.Scanner;
public class Lab2_week1{
    public static void main(){
        System.out.print("enter the kilometres you have driven: ");
        Scanner input=new Scanner(System.in);
        double mile=input.nextDouble();
        System.out.print("enter the kilometres per gallon:");
        input=new Scanner(System.in);
        double km_per_gallon=input.nextDouble();
        System.out.print("enter the price of the gallon");
        input=new Scanner(System.in);
        double price=input.nextDouble();
        double cost_of_driving=(mile/km_per_gallon)*price;
        System.out.print("the cost of trip is:"+ cost_of_driving);

    }
}
