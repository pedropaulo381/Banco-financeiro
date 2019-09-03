
package bancod.financeiro;
 
public class PessoaFisica extends Pessoa{
   private String NomeCompleto;
   private String cpf;
   private String RG;
   
       public void setNomeCompleto(String NomeCompleto){
        this.NomeCompleto = NomeCompleto;
    }
    public String getNomeCompleto(){
        return this.NomeCompleto;
    }
    
     public void setcpf(String cpf){
        this.cpf = cpf;
    }
    public String getcpf(){
        return this.cpf;
    }
    
    public void setRG(String RG){
        this.RG = RG;
    }
    public String getRG(){
        return this.RG;
    }
    
    
}
