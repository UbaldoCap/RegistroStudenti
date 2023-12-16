import java.util.Objects;

public class Studente {
    private Integer id;
    private String nome;
    private Double voto;

    public Studente(int id, String nome, double voto) {
        this.id = id;
        this.nome = nome;
        this.voto = voto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVoto() {
        return voto;
    }

    public void setVoto(Double voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", voto=" + voto +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studente studente = (Studente) o;
        return Objects.equals(id, studente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
