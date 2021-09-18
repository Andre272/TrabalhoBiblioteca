public class Frete {

    // VARIAVEIS
    public int parcelas;
    public int opcao;
    public String estado;
    public double frete;
    
    
      
        public void setParcelas(int parcelas) {
            this.parcelas = parcelas;
        }
    
        public void setOpcao(int opcao) {
            this.opcao = opcao;
        }
    
        public void setEstado(String estado) {
            this.estado = estado;
        }
    
        public void setFrete(double frete) {
            this.frete = frete;
        }
    
        public int getParcelas() {
            return this.parcelas;
        }
    
    
        public float getOpcao() {
            return this.opcao;
        }
    
        public String getEstado() {
            return this.estado;
        }
    
        public double getFrete() {
            return this.frete;
        }
    
    
        public String toString() {
            return this.nome + "\n" + 
                   this.cpf + "\n" + 
                   this.parcelas + "\n" +
                   this.valor + "\n" +
                   this.opcao + "\n" +
                   this.pular + "\n" +
                   this.estado + "\n" +
                   this.frete + "\n" +
                   this.resultado;
    
        }
    }