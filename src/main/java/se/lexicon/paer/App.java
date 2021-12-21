package se.lexicon.paer;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner sc= new Scanner(System.in);
        int aSelect;
        float aNumbmer =0;
        float aDoWith=0;
        boolean imDone = false;

        while (!imDone){

            System.out.println( "The Paerfect Calculator!" );
            System.out.println( "" );
            System.out.println("1 : add a number");
            System.out.println("2 : subtract with a number");
            System.out.println("3 : multiply with a number");
            System.out.println("4 : divide with a number");
            System.out.println("5 : divide with a number");
            System.out.println("-");
            System.out.println("0 Exit System");
            System.out.println("9 Reset");
            System.out.println( "" );
            System.out.println( "Current Number; " +aNumbmer);


            aSelect= sc.nextInt();

            if (aSelect!=0 && aSelect!=9) {

                System.out.println( "Enter the number" );
                aDoWith=sc.nextFloat();


            }
            switch (aSelect){
                case 0:imDone=true;
                    System.out.println( "-- finish" );
                    break;
                case 1: aNumbmer=aNumbmer+aDoWith;
                    break;
                case 2: aNumbmer=aNumbmer-aDoWith;
                    break;
                case 3: aNumbmer=aNumbmer*aDoWith;
                    break;
                case 4: aNumbmer=aNumbmer/aDoWith;
                    break;
            }
        }
    }
}
