import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int melon=sc.nextInt();
        if(melon%2==0 && melon>2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
