package bibliotecaMultimediale;

import java.util.Date;

public class FileAudio extends  FileMultimediale {

    private final int numeroTracce;
    private final boolean livePerformance;


    public FileAudio(int durata, String autore, String genere, Date dataPubblicazione, String nome, int numeroTracce, boolean livePerformance) {
        super(durata, autore, genere, dataPubblicazione, nome);
        this.numeroTracce = numeroTracce;
        this.livePerformance = livePerformance;
    }

    public int getNumeroTracce() {
        return numeroTracce;
    }

    public boolean isLivePerformance() {
        return livePerformance;
    }


    @Override
    public String toString() {
        return  super.toString() +"FileAudio{" +
                "numeroTracce=" + numeroTracce +
                ", livePerformance=" + livePerformance +
                '}';
    }
}
