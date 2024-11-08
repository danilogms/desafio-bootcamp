import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo(" == Curso Java Avançado == ");
        curso.setDescricao("Se trata de um curso avançado para programadores de JAVA!");
        curso.setCargaHoraria(10);
        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" == Mentoria em SQL == ");
        mentoria.setDescricao("Se trata de uma mentoria para desenvolvedores Backend.");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

    }
}