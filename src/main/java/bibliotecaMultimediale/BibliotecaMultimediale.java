package bibliotecaMultimediale;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaMultimediale {

    private final String proprietario;
    private final List<FileMultimediale> files;


    public BibliotecaMultimediale(String proprietario, List<FileMultimediale> files) {
        this.proprietario = proprietario;
        this.files = files;
    }

    public BibliotecaMultimediale( String proprietario) {
        this.proprietario = proprietario;
        this.files = new ArrayList<>();
    }

    public FileMultimediale cercaPerAutore(final String autore){
        return files.stream()
                .filter(file -> file.getAutore()
                .equals(autore))
                .findFirst()
                .orElse(null);
    }

    public String getProprietario() {
        return proprietario;
    }

    public List<FileMultimediale> getFiles() {
        return files;
    }
}
