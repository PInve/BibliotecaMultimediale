package bibliotecaMultimediale;

import java.util.Date;

public class FileVideo extends FileMultimediale{

    private final boolean serieTv;

    public FileVideo(int durata, String autore, String genere, Date dataPubblicazione, String nome, boolean serieTv) {
        super(durata, autore, genere, dataPubblicazione, nome);
        this.serieTv = serieTv;
    }


    public boolean isSerieTv() {
        return serieTv;
    }

    @Override
    public String toString() {
        return super.toString() + "FileVideo{" +
                "serieTv=" + serieTv +
                '}';
    }
}
