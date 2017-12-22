package agenda;

import java.io.*;

public class AGENDA {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File peticions = new File("/Users/DAM/Downloads/bootstrap-3.3.7-dist/AGENDA/src/agenda/peticions.txt");

        try (BufferedReader readReg = new BufferedReader(new FileReader("/Users/DAM/Downloads/bootstrap-3.3.7-dist/AGENDA/src/agenda/peticions.txt"));//BufferReader per llegir l'arxiu origien
                BufferedWriter writeReg2 = new BufferedWriter(new FileWriter("/Users/DAM/Downloads/bootstrap-3.3.7-dist/AGENDA/src/agenda/log.log", true))) {//BufferWriter per escriure en l'arxiu destinatari
            String linia = readReg.readLine();//LLegim la linia
            
            
            if (!peticions.exists()) { //Si l'arxiu peticions.txt no existeix
                peticions.mkdirs(); //Es crea
                System.out.println("El fichero no existía pero se ha creado con exito!");
            }
            String[] bar; //Creem l'array per guaradar els strings
            bar = linia.split("(?=\\s)"); //Separem cada paraula amb salts de linia cada cop que trobi un espai
            for(String liniabar : bar){
                System.out.println(String.format(liniabar));
            }
            
            writeReg2.close();
        }
    }

}
