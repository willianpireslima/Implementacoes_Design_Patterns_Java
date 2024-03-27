package buildermethod;

public class BuilderMethod {
 
    static class ProdutoGenerico {
        public int id;
        public String tipo;

        public ProdutoGenerico(int id, String tipo) {
            this.id = id;
            this.tipo = tipo;
        }

        public void mostrar() {
            System.out.println(tipo + ":" + id);
        }
    }

    static class ProdutoBuilder {
        private int id;
        private String tipo;

        public ProdutoBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public ProdutoBuilder setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public ProdutoGenerico build() {
            return new ProdutoGenerico(id, tipo);
        }
    }

    public static void main(String[] args) {
        ProdutoGenerico produtoA = new ProdutoBuilder()
                                        .setId(12)
                                        .setTipo("A")
                                        .build();
        produtoA.mostrar();

        ProdutoGenerico produtoB = new ProdutoBuilder()
                                        .setId(24)
                                        .setTipo("B")
                                        .build();
        produtoB.mostrar();
    }
    
}
