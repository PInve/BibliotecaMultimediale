package bibliotecaMultimediale;

import generatoriRandom.RandomAudioGenerator;
import generatoriRandom.RandomVideoGenerator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        RandomVideoGenerator rndVideoGen = RandomVideoGenerator.getIstance();
        RandomAudioGenerator rndAudioGen = RandomAudioGenerator.getIstance();

        BibliotecaMultimediale testBiblioteca = new BibliotecaMultimediale("test");

        Set<FileAudio> rndAudios = rndAudioGen.generateMany(10);
        Set<FileVideo> rndVideos = rndVideoGen.generateMany(10);


        testBiblioteca.getFiles().addAll(rndAudios);
        testBiblioteca.getFiles().addAll(rndVideos);

        FileMultimediale result = testBiblioteca.cercaPerAutore("Prova");

        if(result != null)
            System.out.println("File trovato in posizione: " + testBiblioteca.getFiles().indexOf(result));
        else
            System.out.println("Non sono presenti file dell'autore selezionato");


        for(FileMultimediale file : testBiblioteca.getFiles())
            System.out.println(file);
    }

}
