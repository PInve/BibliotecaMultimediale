package generatoriRandom;


import bibliotecaMultimediale.FileVideo;
import java.util.HashSet;
import java.util.Set;

public class RandomVideoGenerator extends randomFileMultimedialeGenerator<FileVideo> implements randomGeneration<FileVideo> {

    //Singleton

    private static RandomVideoGenerator instance = null;

    private RandomVideoGenerator(){};

    public static RandomVideoGenerator getIstance(){
        if(instance == null)
            return new RandomVideoGenerator();
        return  instance;
    }

    @Override
    String getRandomNome() {
        return faker.book().title();
    }

    @Override
    String getRandomGenere() {
        return faker.book().genre();
    }

    @Override
    int getRandomDurataInMinuti() {
        return random.nextInt(120)+60;
    }


    private boolean getRandomSerieTv() {
        int rndChoice = random.nextInt(2);
        return rndChoice > 0;
    }

    @Override
    public FileVideo generateOne() {
        return new FileVideo(
                getRandomDurataInMinuti(),
                getRandomAutore(),
                getRandomGenere(),
                getRandomDataPubblicazione(),
                getRandomNome(),
                getRandomSerieTv()
        );
    }

    @Override
    public Set<FileVideo> generateMany(int amount) {
        Set<FileVideo> rndVideos = new HashSet<>();
        for(int i = 0; i < amount; i++)
            rndVideos.add(this.generateOne());
        return  rndVideos;
    }
}
