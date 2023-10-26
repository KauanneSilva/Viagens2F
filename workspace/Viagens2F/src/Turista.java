public class Turista {
    //Atributos
    private String nome;
    private String cpf;
    //Construtor padrão
    Turista(){}
    // Sobrecarga do construtor
    Turista(String _nome){
        this.nome = _nome; }
    // Mais uma sobrecarga do construtor
    Turista(String _nome, String _cpf) {
        this.nome = _nome;
        this.cpf = _cpf;
    }

    public Turista(Object nome) {
        this.nome = nome.toString();
    }

    //Métodos
    public String viajar(){
        return "viajou!";
    }
    // gatters e setters

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
        //validar cpf
        this.cpf = cpf;
    }
}