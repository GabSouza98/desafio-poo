package dominio;

import lombok.Data;

@Data
public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO*getCargaHoraria();
    }
}
