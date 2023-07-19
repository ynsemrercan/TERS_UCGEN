import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int number;


        System.out.println("Bir Sayı Giriniz: ");
        number=inp.nextInt();

        for(int i = number ; i > 0; i--){

            for(int j=number;j>=i;j--){

                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){

                System.out.print("*");
            }

            System.out.println();



        }









    }
}