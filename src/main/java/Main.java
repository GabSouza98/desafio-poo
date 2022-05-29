import dominio.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Introducao ao Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("Introducao ao Javascript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Introducao ao desenvolvimento com Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Gabriel");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println("Inicio do bootcamp");
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println();

        dev1.progredir();

        System.out.println("Após progredir uma vez");
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("Exp acumulada: " + dev1.calcularTotalXp());
        System.out.println();

        dev1.progredir();
        dev1.progredir();

        System.out.println("Após encerrar o bootcamp");
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("Exp acumulada: " + dev1.calcularTotalXp());

    }

}
