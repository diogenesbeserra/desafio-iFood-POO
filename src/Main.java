import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.view.Menu;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setDescricao("descrição curso java");
        curso1.setTitulo("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setDescricao("descrição curso javaScript");
        curso2.setTitulo("Curso JavaScript");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();

        mentoria.setDescricao("descrição mentoria java");
        mentoria.setTitulo("Mentoria Java");
        mentoria.setData(LocalDate.now());
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Diogenes");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("-----------------");

        Dev dev2 = new Dev();
        dev2.setNome("Pietra");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());

        Menu.inicio(bootcamp);


    }
}