
package bancod.financeiro;

public class PessoaJuridica extends Pessoa{
   private String NomeFantasia;
   private String razaoSocial;
   private String cnpj;
    
   public void setNomeFantasia(String NomeFantasia){
        this.NomeFantasia = NomeFantasia;
    }
    public String getNomeFantasia(){
        return this.NomeFantasia;
    }
    public void setrazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    public String getrazaoSocial(){
        return this.razaoSocial;
    }
    
    public void setcnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getcnpnj(){
        return this.cnpj;
    }
  
}