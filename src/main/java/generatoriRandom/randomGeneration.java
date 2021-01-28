package generatoriRandom;

import com.github.javafaker.Faker;
import java.util.Random;
import java.util.Set;

public interface randomGeneration<T> {

    Faker faker = new Faker();
    Random random = new Random();

    T generateOne();

    Set<T> generateMany(int amount);
}

