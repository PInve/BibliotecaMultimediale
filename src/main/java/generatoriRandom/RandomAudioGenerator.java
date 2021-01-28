package generatoriRandom;

import bibliotecaMultimediale.FileAudio;

import java.util.HashSet;
import java.util.Set;

public class RandomAudioGenerator extends randomFileMultimedialeGenerator<FileAudio> implements randomGeneration<FileAudio> {

    //Singleton

    private static RandomAudioGenerator instance = null;

    private RandomAudioGenerator(){};

    public static RandomAudioGenerator getIstance(){
        if(instance == null)
            return new RandomAudioGenerator();
        return  instance;
    }

    @Override
    String getRandomNome() {
        // a random book title is used because faker does not have albums titles
        return faker.book().title();
    }

    @Override
    String getRandomGenere() {
       return faker.music().genre();
    }

    @Override
    int getRandomDurataInMinuti() {
        return random.nextInt(60) + 20;
    }

    private int getRandomTracce(){
        return random.nextInt(10)+3;
    }

    private boolean getRandomLiveperformance() {
        int rndChoice = random.nextInt(2);
        return rndChoice > 0;
    }

    @Override
    public FileAudio generateOne() {
        return new FileAudio(
                getRandomDurataInMinuti(),
                getRandomAutore(),
                getRandomGenere(),
                getRandomDataPubblicazione(),
                getRandomNome(),
                getRandomTracce(),
                getRandomLiveperformance()
        );
    }

    @Override
    public Set<FileAudio> generateMany(int amount) {
        Set<FileAudio> rndAudios = new HashSet<>();
        for(int i = 0; i < amount; i++)
            rndAudios.add(this.generateOne());
        return  rndAudios;
    }
}
