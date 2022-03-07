import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(9);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descroção mentoria java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("---------------------------------");

        Dev dev = new Dev();
        dev.setNome("Vitor");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteurdos Incritos dev1" + dev.getConteudosInscritos());
        System.out.println("-------");
        dev.progredir();
        dev.progredir();
        System.out.println("Conteurdos Concluidos dev1" + dev.getConteudosConcluidos());
        System.out.println("Conteurdos Incritos dev1" + dev.getConteudosInscritos());
        System.out.println("XP:" + dev.calcularXP());

        System.out.println("----------------------------------");

        Dev dev2 = new Dev();
        dev.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteurdos Incritos dev2" + dev2.getConteudosInscritos());
        System.out.println("------");
        dev2.progredir();
        System.out.println("Conteurdos Concluidos dev2" + dev2.getConteudosConcluidos());
        System.out.println("Conteurdos Incritos dev2" + dev2.getConteudosInscritos());
        System.out.println("XP:" + dev2.calcularXP());

    }
}
