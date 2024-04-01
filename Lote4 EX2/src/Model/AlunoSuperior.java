package Model;

public class AlunoSuperior extends Aluno {
    
private String instituicaoSegundoGrau;
private String anoConclusaoSegundoGrau;

public AlunoSuperior(){
    super();
}

public String getInstituicaoSegundoGrau() {
    return instituicaoSegundoGrau;
}
public void setInstituicaoSegundoGrau(String instituicaoSegundoGrau) {
    this.instituicaoSegundoGrau = instituicaoSegundoGrau;
}
public String getAnoConclusaoSegundoGrau() {
    return anoConclusaoSegundoGrau;
}
public void setAnoConclusaoSegundoGrau(String anoConclusaoSegundoGrau) {
    this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
}


    
}
