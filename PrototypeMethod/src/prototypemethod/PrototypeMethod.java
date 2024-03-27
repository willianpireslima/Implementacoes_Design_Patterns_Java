package prototypemethod;
import java.util.HashMap;
import java.util.Map;

public class PrototypeMethod {

 static abstract class ProdutoGenerico implements Cloneable {
        public int id;

        public ProdutoGenerico clone() {
            ProdutoGenerico clone = null;
            try {
                clone = (ProdutoGenerico) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return clone;
        }
    }

    static class ProdutoA extends ProdutoGenerico {
        ProdutoA(int aux) {
            this.id = aux;
            System.out.println("A:" + this.id);
        }
    }

    static class ProdutoB extends ProdutoGenerico {
        ProdutoB(int aux) {
            this.id = aux;
            System.out.println("B:" + this.id);
        }
    }
    
    static class ProdutoC extends ProdutoGenerico {
        ProdutoC(int aux) {
            this.id = aux;
            System.out.println("C:" + this.id);
        }
    }

    static class FactoryProduto {
        private Map<String, ProdutoGenerico> prototipos = new HashMap<>();

        public FactoryProduto() {
            prototipos.put("A", new ProdutoA(0));
            prototipos.put("B", new ProdutoB(0));
            prototipos.put("C", new ProdutoC(0));
        }

        public ProdutoGenerico getProduto(String tipo) {
            ProdutoGenerico prototipo = prototipos.get(tipo);
            if (prototipo != null) {
                return prototipo.clone();
            }
            return null; // Retornar null em caso de tipo inválido
        }
    }

    public static void main(String[] args) {
        FactoryProduto obj = new FactoryProduto();
        ProdutoGenerico produtoA = obj.getProduto("A");
    }
    
}
