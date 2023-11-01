/**
 *
 * @authors Bruna Letícia e Felipe Parra 
 */

public class Vendedor {
        private String cpf;
        private String nome;
        private double salarioBase;
        private double taxaComissao;
        
        public Vendedor(String c, String n, double sb ){
            cpf = c;
            nome = n;
            salarioBase = sb;
            taxaComissao = salarioBase * 0.25;
        }
        
        public String getCpf() {
            return cpf;
        }
        
        public String getNome() {
            return nome;
        }
        
        public double getSalarioBase() {
            return salarioBase;
        }
            
        public double getTaxaComissao() {
            return taxaComissao;
        }
        
        public void setNome(String n) {
            nome = n;
        }
        
        public void setSalarioBase(double sb) {
            salarioBase = sb;
        }
        
        public void setTaxaComissao(double tc) {
            taxaComissao = tc;
        }
}
