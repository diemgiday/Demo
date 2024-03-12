
package JavaHelloWorld;
import java.util.*;

public class JavaHelloWorld{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=0 || b<=0) {           
             System.out.print(0);
        }
        else {
             System.out.print((a+b)*2+" "+a*b);
        }
    }   
}
