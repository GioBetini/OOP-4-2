package View;

import Controller.AlunoSuperiorController;
import Controller.AlunoTécnicoController;
import Model.AlunoSuperior;
import Model.AlunoTécnico;

public class Main {
    public static void main(String[] args) throws Exception {
        AlunoSuperior alSuperior = new AlunoSuperior();
        alSuperior.setRa("0001");
        alSuperior.setNome("Fulano");
        alSuperior.setEmail("fulano@gmail.com");
        alSuperior.setQtdAprovacoes(5);
        alSuperior.setMediaNotas(7.3f);
        AlunoSuperiorController superiorController = new AlunoSuperiorController();

        AlunoTécnico alTecnico = new AlunoTécnico();
        alTecnico.setRa("0011");
        alTecnico.setNome("Beltrano");
        alTecnico.setEmail("beltrano@gmail.com");
        alTecnico.setQtdAprovacoes(4);
        alTecnico.setMediaNotas(8.0f);
        AlunoTécnicoController tecnicoController = new AlunoTécnicoController();

        System.out.println(superiorController.percentualProgressao(alSuperior));
        System.out.println(superiorController.percentualRendimento(alSuperior));
        System.out.println(tecnicoController.percentualProgressao(alTecnico));
        System.out.println(tecnicoController.percentualRendimento(alTecnico));


    }
}
