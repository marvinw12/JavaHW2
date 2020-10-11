import java.util.Random;

public class main {
    public static void main(String[] args) {


    int k = 80;
    for (int i = 0; i < 5; i++) {
        k = k-12;
    }

    System.out.println(k);

    for (int i = 1; i <= 6; i++) {
        for (int j = 1; j <= i; j++) {
        System.out.print("*");
        }  
        System.out.println();   
    }       
}
}   
