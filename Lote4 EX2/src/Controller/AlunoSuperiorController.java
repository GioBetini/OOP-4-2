package Controller;

import Model.Aluno;

public class AlunoSuperiorController implements IAlunoController {

    public AlunoSuperiorController(){
        super();
    }


    @Override
    public float percentualRendimento(Aluno aluno) {
       return aluno.getMediaNotas() * aluno.getQtdAprovacoes() * 0.972f;
    }

    @Override
    public float percentualProgressao(Aluno aluno) {
       return aluno.getQtdAprovacoes()/6;
    }
    
}
