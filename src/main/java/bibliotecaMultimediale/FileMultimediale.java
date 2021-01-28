package bibliotecaMultimediale;

import java.util.Date;

public  abstract  class FileMultimediale {

    private static int ID_COUNT = 0;

    private final int id;
    private final int durataInMinuti;
    private final String autore;
    private final String genere;
    private final Date dataPubblicazione;
    private final String nome;

    public FileMultimediale(int durata, String autore, String genere, Date dataPubblicazione, String nome) {
        this.id = FileMultimediale.ID_COUNT;
        FileMultimediale.ID_COUNT += 1;
        this.durataInMinuti = durata;
        this.autore = autore;
        this.genere = genere;
        this.dataPubblicazione = dataPubblicazione;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public int getDurataInMinuti() {
        return durataInMinuti;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    public Date getDataPubblicazione() {
        return dataPubblicazione;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "FileMultimediale{" +
                "id=" + id +
                ", durataInMinuti=" + durataInMinuti +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", dataPubblicazione=" + dataPubblicazione +
                ", nome='" + nome + '\'' +
                '}';
    }
}
