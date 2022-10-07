import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

    }
}