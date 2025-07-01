import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next().toLowerCase();
        String s2=sc.next().toLowerCase();
        System.out.println(Integer.compare(s1.compareTo(s2),0));
    }
}
