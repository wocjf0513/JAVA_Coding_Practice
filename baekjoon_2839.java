import java.util.*;


public class Main{

    public static void main(String[] args) {
        System.out.println(envelope(18));
    }
    public static int envelope(int n){
        float x,y;
        x=0;
        y=0;

        while(true){
            y=(n-3*x)/5;
            if(y-(int)y==0 && (3*x+5*y)==n){
                return (int)(x+y);
            }
            x++;
            if(3*x>n)
            return -1;
        }
    }
}