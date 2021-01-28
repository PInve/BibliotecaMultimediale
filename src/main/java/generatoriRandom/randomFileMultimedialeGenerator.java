package generatoriRandom;

import java.util.Date;

public  abstract class randomFileMultimedialeGenerator<T> implements randomGeneration<T> {

    protected static String getRandomAutore(){
        return faker.name().firstName() + " " + faker.name().lastName();
    }

    protected static Date getRandomDataPubblicazione(){
        return faker.date().birthday();
    }

     abstract String getRandomNome();

    abstract String getRandomGenere();

    abstract int getRandomDurataInMinuti();

}
