/**
 * Created by Lenovo on 22.06.2017.
 */
public class Main {
    public static void main(String[] args) {

        // Pętla ta będzie wykonywać się dopóty warunek zwraca true czyli prawdę
        int counter = 0;
        while (counter <= 10) {
                System.out.println("While");
                counter++;
        }

        //Do while
        int counterDoWhile = 12;
        do{
            System.out.println("Do while");
            counterDoWhile++;
        }while (counterDoWhile <= 10);


        //break  - przerywa działanie petli
        //continue - przerywa wykonanie poszególnego obrotu i wraca do warunku
        for (int i = 400; i <= 500; i++) {
            if(i == 450){
                break;
            }
            System.out.println("Liczmy: " + i);
        }

        String[] tablicaArray = new String[4];
        tablicaArray[0] = "pierwsza";
        tablicaArray[1] = "druga";
        tablicaArray[2] = "trzecia";
        tablicaArray[3] = "czwarta";

        // pętla klasyczna for
        for(int i = 0; i < tablicaArray.length; i++){
            System.out.println(tablicaArray[i]);
        }

        //pętla for each
        for(String text : tablicaArray) {
            System.out.println(text);
        }

        System.out.println("To powinno wykonać się po pętli!");

    }
}
