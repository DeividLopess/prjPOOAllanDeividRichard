package fatec.poo.model;

/**
 *
 * @author Deivid
 */
public class Hospede extends Pessoa{
    private String cpf;
    private double txDesconto;
    private QuartoHotel quartoHotel;
    private String idade;
    
    //CONSTRUTOR
    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }
    
    //SETS
    public void setTxDesconto(double txDesconto) {
        this.txDesconto = txDesconto/100;
    }

    public void setQuartoHotel(QuartoHotel quartoHotel) {
        this.quartoHotel = quartoHotel;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    
    //GETS
    public String getCpf() {
        return cpf;
    }

    public double getTxDesconto() {
        return txDesconto;
    }

    public QuartoHotel getQuartoHotel() {
        return quartoHotel;
    }

    public String getIdade() {
        return idade;
    }
    
    
    
    
    
    
}
