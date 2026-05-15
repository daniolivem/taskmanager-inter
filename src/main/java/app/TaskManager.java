package app;

import controller.TaskManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
import model.Tarefa;
import model.TarefaPrioritaria;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
public class TaskManager {

    public static void main(String[] args) {
        TaskManager<Tarefa> gerente = new TaskManager();
        try (Scanner leitor = new Scanner(System.in)) {
            int opcao = 0;
            do {
                try {
                    System.out.println("");
                    
                    opcao = leitor.nextInt();
                    leitor.nextLine();
                    
                    switch (opcao) {
                        case 1 -> {
                            System.out.println("Qual o titulo da tarefa?");
                            String titulo = leitor.nextLine();
                            
                            System.out.println("Tipo: (1) Normal ou (2) Prioritaria?");
                            int tipo = Integer.parseInt(leitor.nextLine());
                            
                            Tarefa t; //a variavel "pai" precisa ser declarada fora do if
                            
                            if (tipo == 2) {
                                
                                t = new TarefaPrioritaria(titulo, "Alta");
                            } else {
                                t = new Tarefa(titulo); //atribuimos a  pai
                            }
                            gerente.criarTarefa(t);
                            System.out.println("Tarefa adicionada!");
                        }
                        
                        case 2 ->
                            gerente.listarTarefa();
                        case 3 -> {
                            System.out.println("Qual o número da tarefa que deseja concluir?");
                            String entrada = leitor.nextLine();
                            int indice = Integer.parseInt(entrada) - 1;
                            gerente.concluida(indice);
                        }
                        case 4 -> {
                            System.out.println("Qual o número da tarefa?");
                            String entrada = leitor.nextLine();
                            int indice = Integer.parseInt(entrada) - 1;
                            gerente.excluirTarefa(indice);
                            
                        }
                        case 5 -> {
                            System.out.println("Saindo");
                        }
                        default ->
                            System.out.println("Opção inválida");
                    }
                    
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Digite apenas números.");
                    leitor.nextLine();
                }
            } while (opcao != 5);
            //fecha o Scanner
        }

    }

}


