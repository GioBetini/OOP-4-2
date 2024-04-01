package Controller;

import Model.Aluno;

public class AlunoTécnicoController implements IAlunoController{

    public AlunoTécnicoController(){
        super();
    }

    @Override
    public float percentualRendimento(Aluno aluno) {
       return aluno.getQtdAprovacoes() * aluno.getMediaNotas() * 0.931f;
    }

    @Override
    public float percentualProgressao(Aluno aluno) {
       return aluno.getQtdAprovacoes()/3;
    }

}
