import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int h=in.nextInt();
        for(int i=1;i<=h;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("x");
            System.out.println();
        }
    }
}
