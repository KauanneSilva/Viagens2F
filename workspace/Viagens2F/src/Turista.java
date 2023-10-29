public class Turista {
 
    private String nome;
    private String cpf;
   
    Turista(){}
    
    Turista(String _nome){
        this.nome = _nome; }
   
    Turista(String _nome, String _cpf) {
        this.nome = _nome;
        this.cpf = _cpf;
    }

    public Turista(Object nome) {
        this.nome = nome.toString();
    }

    public String viajar(){
        return "viajou!";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
       
        this.cpf = cpf;
    }
}
