package View;
import Controller.PratoController;
import Model.Prato;

public class Principal {
    public static void main(String[] args) {
        PratoController p = new PratoController();

        Prato p1 = new Prato();
      
        p1.id = 1000;
        p1.nome = "Prato Redondo";
        p1.cor = "Branco";
        p1.valor = 9.90;

        // CREATE
        p.adicionar(p1);
        System.out.println("Prato Redondo Branco");
        listar(p);
        
        Prato p2 = new Prato();
        p2.id = 2000;
        p2.nome = "Prato Quadrado";
        p2.cor = "Azul";
        p2.valor = 12.90;
        System.out.println("Prato criado com sucesso!\n");
        p.adicionar(p2);
        listar(p);

        // UPDATE
        System.out.println("Atualizar Pratos: \n");
        p.atualizar(p2);
        listar(p);

        Prato p3 = new Prato();
        p3.id = 2000;
        p3.nome="Prato Quadrado";
        p3.cor = "Rosa";
        p3.valor = 15.90;
        System.out.println("Pratos Atualizados! \n");
        p.adicionar(p3);
        listar(p);

        //uso de DELETE
        System.out.println("Item removido. \n ");
        p.excluir(p2);
        listar(p);
    }

    private static void listar(PratoController pc){
        // READ
        for (Prato p : pc.listar()) {
            System.out.println(p);
        }
    }
}
