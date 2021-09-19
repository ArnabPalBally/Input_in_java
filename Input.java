//input
import java.util.*;
public class Input{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print(name);
        //to input more than one string 
        Scanner sm = new Scanner(System.in);
        String ap = sm.nextLine();
        System.out.println(ap);
        Scanner em = new Scanner(System.in);
        int a = em.nextInt();
        int b = em.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}