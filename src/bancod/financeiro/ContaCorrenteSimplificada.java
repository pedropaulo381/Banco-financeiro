
package bancod.financeiro;
public class ContaCorrenteSimplificada {
    
    private String agencia;
    private String nroConta;
    private double saldo;
    private Pessoa pessoa;
    
    public double depositar(double valor){
        this.saldo = this.saldo + valor;
        return this.saldo;
    }
    public double sacar(double valor){
       if(saldo < valor){
           System.out.println("Saldo insuficiente");     
      }else{
           this.saldo = this.saldo - valor;
       }
       return this.saldo;
    }
    public void exibirDados(){
        System.out.println("AGENCIA:" + this.agencia);
        System.out.println("Conta-Corrente: "+this.nroConta );
        if(this.pessoa instanceof PessoaFisica){    
            
            System.out.println("NOME: "+ ((PessoaFisica)this.pessoa).getNomeCompleto());
            System.out.println("RG: "  + ((PessoaFisica)this.pessoa).getRG());
            System.out.println("CPF: " + ((PessoaFisica)this.pessoa).getcpf());
        
    }else if(this.pessoa instanceof PessoaJuridica){
            System.out.println("NOME: "+ ((PessoaFisica)this.pessoa).getNomeCompleto());
            System.out.println("RG: "  + ((PessoaFisica)this.pessoa).getRG());
            System.out.println("CPF: " + ((PessoaFisica)this.pessoa).getcpf());
    }
        
         System.out.println("SALDO: " + this.saldo);
    
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public String getAgencia(){
        return this.agencia;
    }
    public void setnroConta(String nroConta){
        this.nroConta = nroConta;
    }
    public String getnroConta(){
        return this.nroConta;
    }
    
    public void setpessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    public Pessoa getpessoa(){
        return this.pessoa;
    }


}
