import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("inserisci lato");
        int lato = input.nextInt();
                                                // area e perimetro del quadrato
        int Aquadrato= lato * lato;
        System.out.println("L'area è: " + Aquadrato);
        int Pquadrato= lato * 4 ;
        System.out.println("Il perimetro è: " + Pquadrato);


        System.out.println("inserisci base");
        int base = input.nextInt();
        System.out.println("insrerisci altezza");
        int altezza = input.nextInt();
                                                // area e perimetro del rettangolo
        int Arettangolo= base * altezza;
        System.out.println("L' area del rettangolo è: " + Arettangolo);
        int Prettangolo= (base + altezza) * 2;
        System.out.println("Il perimetro del quadrato è: " + Prettangolo);


        System.out.println("inserisci ltriangolo");
        int ltriangolo = input.nextInt();
        System.out.println("inserisci htriangolo");
        int htriangolo = input.nextInt();
                                                // area e perimetro del triangolo
        int Atriangolo= ltriangolo * htriangolo / 2;
        System.out.println("L' area del triangolo é:" + Atriangolo);
        int Ptriangolo = ltriangolo * 3;
        System.out.println("Il permetro del triangolo è: " + Ptriangolo);


        System.out.println("inserisci rcerchio");
        int rcerchio = input.nextInt();
                                                // area e perimetro del cerchio
        double Acerchio= rcerchio * 2 * 3.14;
        System.out.println("L' area del cerchio é: " + Acerchio );
        double Pcerchio= rcerchio * rcerchio * 3.14;

    }
}